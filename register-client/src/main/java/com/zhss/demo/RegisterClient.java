package com.zhss.demo;

import java.util.UUID;

/**
 * 在服务上被创建和启动，负责跟register-server进行通信
 * registerclient类这里的线程最先启动  启动之后就到registerWorker类，直接找到http组件，
 * 去发送网络请求到register-server服务中去，完成注册，把自己的相关服务信息发送过去
 * Created by CTWLPC on 2019/1/10.
 */
public class RegisterClient {

    private static final Long HEARTBEAT_INTERVAL = 30 * 1000L;

    public static final String SERVICE_NAME = "inventory-service";
    public static final String IP = "192.168.31.207";
    public static final String HOSTNAME = "inventory01";
    public static final int PORT = 9000;

    /**
     * http通信组件
     */
    private HttpSender httpSender;
    /**
     * 服务实例id
     */
    private String serviceInstanceId;
    /**
     * 心跳线程
     */
    private HeartbeatWorker heartbeatWorker;
    /**
     * 服务实例是否在运行
     */
    private volatile Boolean isRunning;

    public RegisterClient() {
        // 生成一个随机的服务实例id
        this.serviceInstanceId = UUID.randomUUID().toString().replace("-", "");
        this.httpSender = new HttpSender();
        this.heartbeatWorker = new HeartbeatWorker();
        this.isRunning = true;
    }

    public void start() {
        try {
            // 一旦启动了这个组件之后，他就负责在服务上干两个事情
            // 第一个事情，就是开启一个线程向register-server去发送请求，注册这个服务
            // 第二个事情，就是在注册成功之后，就会开启另外一个线程去发送心跳
//        new RegisterWorker().start();
//        try {
////            Thread.sleep(500);
//            // 线程sleep这块，还是用的最最原始的sleep，
//            // 因为可以通过毫秒数，动态的传入一个外面配置的一个值
//            Thread.sleep(HEARTBEAT_INTERVAL);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

            // 我们来简化一下这个模型
            // 我们在register-client这块就开启一个线程
            // 这个线程刚启动的时候，第一个事情就是完成注册
            // 如果注册完成了之后，他就会进入一个while true死循环
            // 每隔30秒就发送一个请求去进行心跳
            // 我们来简化一下这个模型
            // 我们在register-client这块就开启一个线程
            // 这个线程刚启动的时候，第一个事情就是完成注册
            // 如果注册完成了之后，他就会进入一个while true死循环
            // 每隔30秒就发送一个请求去进行心跳
            RegisterWorker registerWorker = new RegisterWorker();
            registerWorker.start();
            // 可以尝试将join()注释掉，再测试看效果，是不对的
            registerWorker.join();

//            HeartbeatWorker heartbeatWorker = new HeartbeatWorker(serviceInstanceId);
            heartbeatWorker.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 停止RegisterClient组件
     */
    public void shutdown() {
        this.isRunning = false;
        // 对各个工作线程都执行interrupt
        // 因为各个工作线程可能都在不断的while循环运行，
        // 但是每次执行完一次之后，都会进入休眠的状态，sleep 30秒
        this.heartbeatWorker.interrupt();
        // 这里相当于会打断heartbeatWorker中的sleep()的休眠
    }

    /**
     * 服务注册的线程
     */
    private class RegisterWorker extends Thread {

        public void run() {
            // 应该是获取当前机器的信息
            // 包括当前机器的ip地址、hostname，以及你配置这个服务监听的端口号
            // 从配置文件里可以拿到
            RegisterRequest registerRequest = new RegisterRequest();
            registerRequest.setServiceName(SERVICE_NAME);
            registerRequest.setIp(IP);
            registerRequest.setHostname(HOSTNAME);
            registerRequest.setPort(PORT);
            registerRequest.setServiceInstanceId(serviceInstanceId);

            RegisterResponse registerResponse = httpSender.register(registerRequest);
            System.out.println("服务注册的结果是：" + registerResponse.getStatus() + "......");
        }

    }

    /**
     * 心跳的线程
     * Created by CTWLPC on 2019/1/10.
     */
    private class HeartbeatWorker extends Thread {
        /**
         * 服务实例id
         */
        private String serviceInstanceId;

//        public HeartbeatWorker(String serviceInstanceId) {
////            this.httpSender = new HttpSender();
////            this.finishedRegister = false;
//            this.serviceInstanceId = serviceInstanceId;
//        }

        public void run() {
            // 如果注册成功了,就进入while true死循环
            HeartbeatRequest heartbeatRequest = new HeartbeatRequest();
            heartbeatRequest.setServiceName(SERVICE_NAME);
            heartbeatRequest.setServiceInstanceId(serviceInstanceId);
            HeartbeatResponse heartbeatResponse = null;

            while (isRunning) {
                try {
                    heartbeatResponse = httpSender.heartbeat(heartbeatRequest);
                    System.out.println("心跳的结果为：" + heartbeatResponse.getStatus() + "......");
                    Thread.sleep(HEARTBEAT_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

//    /**
//     * 负责向register-server发起注册申请的线程
//     * Created by CTWLPC on 2019/1/10.
//     */
//    private class RegisterClientWorker extends Thread {
//
//        public static final String SERVICE_NAME = "inventory-service";
//        public static final String IP = "192.168.31.207";
//        public static final String HOSTNAME = "inventory01";
//        public static final int PORT = 9000;
//
//        /**
//         * http通信组件
//         */
//        private HttpSender httpSender;
//        /**
//         * 是否完成服务注册
//         */
//        private Boolean finishedRegister;
//        /**
//         * 服务实例id
//         */
//        private String serviceInstanceId;
//
//        public RegisterClientWorker(String serviceInstanceId) {
//            this.httpSender = new HttpSender();
//            this.finishedRegister = false;
//            this.serviceInstanceId = serviceInstanceId;
//        }
//
//        public void run() {
//            if (!finishedRegister) {
//                // 应该是获取当前机器的信息
//                // 包括当前机器的ip地址、hostname，以及你配置这个服务监听的端口号
//                // 从配置文件里可以拿到
//                RegisterRequest registerRequest = new RegisterRequest();
//                registerRequest.setServiceName(SERVICE_NAME);
//                registerRequest.setIp(IP);
//                registerRequest.setHostname(HOSTNAME);
//                registerRequest.setPort(PORT);
//                registerRequest.setServiceInstanceId(serviceInstanceId);
//
//                RegisterResponse registerResponse = httpSender.register(registerRequest);
//                System.out.println("服务注册的结果是：" + registerResponse.getStatus() + "......");
//
//                // 如果说注册成功的话
//                if (RegisterResponse.SUCCESS.equals(registerResponse.getStatus())) {
//                    this.finishedRegister = true;
//                } else {
//                    // 直接返回
//                    return;
//                }
//            }
//
//            // 如果注册成功了,就进入while true死循环
//            if (finishedRegister) {
//                HeartbeatRequest heartbeatRequest = new HeartbeatRequest();
//                heartbeatRequest.setServiceName(SERVICE_NAME);
//                heartbeatRequest.setServiceInstanceId(serviceInstanceId);
//                HeartbeatResponse heartbeatResponse = null;
//
//                while (true) {
//                    try {
//                        heartbeatResponse = httpSender.heartbeat(heartbeatRequest);
//                        System.out.println("心跳的结果为：" + heartbeatResponse.getStatus() + "......");
//                        Thread.sleep(HEARTBEAT_INTERVAL);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//
//    }

}

package com.zhss.service.eureka.demo.register.client;

/**
 * Created by CTWLPC on 2018/11/9.
 */
public class RegisterClientWorker {

    private String serviceInstanceId;

    public RegisterClientWorker(String serviceInstanceId) {
//        this.httpSender = new HttpSender();
//        this.finishedRegister = false;
        this.serviceInstanceId = serviceInstanceId;
    }

    public void run() {

    }
}

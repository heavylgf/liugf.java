package com.zhss.demo;

/**
 * Register-Client组件的测试类
 * Created by CTWLPC on 2019/1/11.
 */
public class RegisterClientTest {

    public static void main(String[] args) throws Exception {
        RegisterClient registerClient = new RegisterClient();
        registerClient.start();

        Thread.sleep(5000);
        registerClient.shutdown();
    }

}
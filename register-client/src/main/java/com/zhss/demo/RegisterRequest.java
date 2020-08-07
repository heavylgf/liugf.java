package com.zhss.demo;

import java.security.PrivilegedExceptionAction;

/**
 * 注册请求
 * Created by CTWLPC on 2019/1/10.
 */
public class RegisterRequest {

    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 服务所在机器ip地址
     */
    private String ip;
    /**
     * 服务所在的机器主机名
     */
    private String hostname;
    /**
     * 服务监听着那个端口号
     */
    private int port;
    /**
     * 服务实例
     */
    private String serviceInstanceId;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getServiceInstanceId() {
        return serviceInstanceId;
    }

    public void setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "serviceName='" + serviceName + '\'' +
                ", ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                ", port=" + port +
                ", serviceInstanceId='" + serviceInstanceId + '\'' +
                '}';
    }

}

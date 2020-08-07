package com.zhss.demo;

/**
 * 心跳请求
 * Created by CTWLPC on 2019/1/11.
 */
public class HeartbeatRequest {

    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 服务实例id
     */
    private String serviceInstanceId;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceInstanceId() {
        return serviceInstanceId;
    }

    public void setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
    }

    @Override
    public String toString() {
        return "HeartbeatRequest{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceInstanceId='" + serviceInstanceId + '\'' +
                '}';
    }

}

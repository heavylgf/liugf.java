package com.zhss.demo;

/**
 * 心跳的响应
 * Created by CTWLPC on 2019/1/11.
 */
public class HeartbeatResponse {

    public static final String SUCCESS = "success";
    public static final String FAILUE = "failue";

    /**
     * 心跳响应状态：SUCCESS、FAILURE
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

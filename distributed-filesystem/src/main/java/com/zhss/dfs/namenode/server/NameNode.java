package com.zhss.dfs.namenode.server;

/**
 * NameNode核心启动类
 * Created by CTWLPC on 2019/1/17.
 */
public class NameNode {

    /**
     * NameNode是否在运行
     */
    private volatile Boolean shouldRun;

    public NameNode() {
        this.shouldRun = true;
    }


}

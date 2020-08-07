package com.zhss.dfs.namenode.server;

/**
 * NameNode的rpc服务的接口
 * Created by CTWLPC on 2018/12/7.
 */
public class NameNodeRpcServer {

    /**
     * 负责元数据的核心组件
     */
    private FSNamesystem namesystem;

    public NameNodeRpcServer(FSNamesystem namesystem) {
        this.namesystem = namesystem;
    }

    /**
     * 创建目录
     *
     * @param path 目录路径
     * @return 是否创建成功
     */
    public boolean mkdir(String path) {
        return this.namesystem.mkdir(path);
    }

//    /**
//     * 创建目录
//     * @param path 目录路径
//     * @return 是否创建成功
//     * @throws Exception
//     */
//    public Boolean mkdir(String path) throws Exception {
//        return this.namesystem.mkdir(path);
//    }
}

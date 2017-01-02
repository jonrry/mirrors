package com.github.jonrry.mirrors.rpc.meta;

import java.io.Serializable;

/**
 * Created by zongyue.xzy on 17/1/2.
 */
public class ServiceInfo implements Serializable{

    //服务名称
    private String serviceName;

    //提供服务的ip地址
    private String targetIp;
}

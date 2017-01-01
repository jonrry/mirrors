package com.gitub.jonrry.mirrors;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcApiConsumerBean {

    //服务名称
    private String serviceName;

    //对应的服务接口全程
    private String tagetServiceName;

    //提供服务的机器ip地址
    private String providerIp;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTagetServiceName() {
        return tagetServiceName;
    }

    public void setTagetServiceName(String tagetServiceName) {
        this.tagetServiceName = tagetServiceName;
    }

    public String getProviderIp() {
        return providerIp;
    }

    public void setProviderIp(String providerIp) {
        this.providerIp = providerIp;
    }
}

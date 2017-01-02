package com.gitub.jonrry.mirrors;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcApiProviderBean {

    //坚挺该服务配置是否已经被初始化了
    private AtomicBoolean isInit = new AtomicBoolean(false);


    //服务名称
    private String serviceName;

    //对应的服务接口全称
    private String interfaceServiceName;

    //提供服务的机器ip地址
    private String providerIp;

    //目标实现类
    private Object targetClass;

    //服务版本【暂时不使用】
    private int  serviceVersion;

    //客户端等待响应的超时时间
    private int  timingOut;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getInterfaceServiceName() {
        return interfaceServiceName;
    }

    public void setInterfaceServiceName(String interfaceServiceName) {
        this.interfaceServiceName = interfaceServiceName;
    }

    public String getProviderIp() {
        return providerIp;
    }

    public void setProviderIp(String providerIp) {
        this.providerIp = providerIp;
    }

    public Object getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(Object targetClass) {
        this.targetClass = targetClass;
    }

    public int getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(int serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public int getTimingOut() {
        return timingOut;
    }

    public void setTimingOut(int timingOut) {
        this.timingOut = timingOut;
    }

    public AtomicBoolean getIsInit() {
        return isInit;
    }

    public void setIsInit(AtomicBoolean isInit) {
        this.isInit = isInit;
    }
}

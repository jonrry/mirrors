package com.gitub.jonrry.mirrors.meta;

import java.util.List;

/**
 * Created by zongyue.xzy on 17/1/4.
 */
public class ServiceInfoMeta {

    private String intefaceServiceName;

    private String providerIp;

    private String methodName;

    private int serviceVersion;

    private List<Class> paramTypes;

    public String getIntefaceServiceName() {
        return intefaceServiceName;
    }

    public void setIntefaceServiceName(String intefaceServiceName) {
        this.intefaceServiceName = intefaceServiceName;
    }

    public String getProviderIp() {
        return providerIp;
    }

    public void setProviderIp(String providerIp) {
        this.providerIp = providerIp;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public int getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(int serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public List<Class> getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(List<Class> paramTypes) {
        this.paramTypes = paramTypes;
    }
}

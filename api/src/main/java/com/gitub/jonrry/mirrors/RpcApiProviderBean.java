package com.gitub.jonrry.mirrors;

import com.github.jonrry.mirrors.constant.classload.ClassLoaderUtil;
import com.github.jonrry.mirrors.constant.log.MirrorsLogHelper;
import com.gitub.jonrry.mirrors.meta.ServiceInfoMeta;
import com.gitub.jonrry.mirrors.process.ServicePublihProcess;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcApiProviderBean {


//    ClassLoaderUtil classLoaderUtil =  new ClassLoaderUtil();

    //服务基础信息
    ServiceInfoMeta serviceInfoMeta = new ServiceInfoMeta();


    ServicePublihProcess servicePublihProcess;


    private AtomicBoolean isPublished = new AtomicBoolean(false);


    //坚挺该服务配置是否已经被初始化了
    private AtomicBoolean isInit = new AtomicBoolean(false);


    //默认构造器
    public RpcApiProviderBean(){
        //初始化服务发布类
        this.servicePublihProcess = ClassLoaderUtil.classLoad(ServicePublihProcess.class);
    }

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


    /**
     * 开始服务的发布流程
     */
    public void publish(){

        /**如果该bean已经被初始化了,就不要再次进行初始化*/
        if(isPublished.get()){
            MirrorsLogHelper.infoLog(this.getClass().getName(),"RpcApiProviderBean","this bean have been init");
//            return;
        }else {
            //标志该bean已经进行了初始化
            isPublished.set(true);
        }




    }

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
        this.serviceInfoMeta.setIntefaceServiceName(interfaceServiceName);
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

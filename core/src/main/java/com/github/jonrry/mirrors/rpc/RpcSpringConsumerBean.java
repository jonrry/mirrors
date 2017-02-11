package com.github.jonrry.mirrors.rpc;

import com.gitub.jonrry.mirrors.RpcApiConsumerBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcSpringConsumerBean implements FactoryBean, InitializingBean {


    RpcApiConsumerBean rpcApiConsumerBean = new RpcApiConsumerBean();

    @Override
    public void afterPropertiesSet() throws Exception {
        this.init();
    }


    private void init(){

    }

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }


    //设置服务名称
    public void setInterfaceServiceName(String interfaceServiceName){
        rpcApiConsumerBean.setInterfaceServiceName(interfaceServiceName);
    }


    //设置服务版本号
    public void setServiceVersion(String serviceVersion){
        this.rpcApiConsumerBean.setServiceVersion(serviceVersion);
    }

}

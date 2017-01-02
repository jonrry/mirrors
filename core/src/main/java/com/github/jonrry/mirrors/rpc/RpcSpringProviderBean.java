package com.github.jonrry.mirrors.rpc;

import com.gitub.jonrry.mirrors.RpcApiConsumerBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcSpringProviderBean implements FactoryBean, InitializingBean {


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

    public void setInterfaceServiceName(String interfaceServiceName){
        rpcApiConsumerBean.setInterfaceServiceName(interfaceServiceName);
    }


}

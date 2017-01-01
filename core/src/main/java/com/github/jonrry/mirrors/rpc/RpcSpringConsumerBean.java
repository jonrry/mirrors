package com.github.jonrry.mirrors.rpc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcSpringConsumerBean implements FactoryBean, InitializingBean {


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


}

package com.github.jonrry.mirrors.rpc;

import com.gitub.jonrry.mirrors.RpcApiProviderBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zongyue.xzy on 17/1/1.
 */
public class RpcSpringProviderBean implements  InitializingBean {

    RpcApiProviderBean rpcApiProviderBean = new RpcApiProviderBean();

    @Override
    public void afterPropertiesSet() throws Exception {
        this.init();
    }

    public void init(){
        //参数校验
        checkRpcParams();
    }


    private void checkRpcParams(){

    }

    //设置接口全称
    public void setInterfaceServiceName(String interfaceServiceName){
        rpcApiProviderBean.setInterfaceServiceName(interfaceServiceName);
    }

    //设置spring服务的bean的id
    public void setServiceName(String serviceName){
        rpcApiProviderBean.setServiceName(serviceName);
    }




}

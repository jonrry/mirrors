package com.github.jonrry.mirrors.rpc;

import com.github.jonrry.mirrors.constant.MirrorsExceptionEnum;
import com.github.jonrry.mirrors.utils.StringUtils;
import com.github.jonrry.mirrors.utils.log.MirrorsLogHelper;
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
        try{
            //参数校验
            checkRpcParams();



        }catch (Exception e){
            MirrorsLogHelper.errorLog(this.getClass().getName(),"init","occur error",e);
        }
    }


    /**
     * 参数校验
     * <li>如果参数是非法的,打印warn日志,并抛出异常</li>
     * @throws Exception
     */
    private void checkRpcParams() throws Exception{

        String intefaceServiceName = rpcApiProviderBean.getInterfaceServiceName();
        String ipAddress = rpcApiProviderBean.getProviderIp();

        if(StringUtils.isEmpty(intefaceServiceName) || StringUtils.isEmpty(ipAddress)){
            MirrorsLogHelper.warnLog(this.getClass().getName(), "checkRpcParams", MirrorsExceptionEnum.ILLEGALPARAM);
        }
    }

    //设置接口全称
    public void setInterfaceServiceName(String interfaceServiceName){
        rpcApiProviderBean.setInterfaceServiceName(interfaceServiceName);
    }

    //设置spring服务的bean的id
    public void setServiceName(String serviceName){
        rpcApiProviderBean.setServiceName(serviceName);
    }

    //TODO 继续set初始化属性




}

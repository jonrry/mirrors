package com.gitub.jonrry.mirrors.process;

import com.github.jonrry.mirrors.constant.util.StringUtils;
import com.gitub.jonrry.mirrors.meta.ServiceInfoMeta;

/**
 * Created by zongyue.xzy on 17/1/4.
 */
public class ServicePublihProcess {


    /**
     * 通过
     * @param serviceInfoMeta
     */
    public void publish(ServiceInfoMeta serviceInfoMeta) throws Exception{

        /**1、参数校验**/
        if(serviceInfoMeta == null || StringUtils.isEmpty(serviceInfoMeta.getIntefaceServiceName())){
            //打印warn日志,并且报错返回;
            throw new  Exception("params is empty");
        }


    }
}

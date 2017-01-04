package com.github.jonrry.mirrors.constant.log;


/**
 * Created by zongyue.xzy on 17/1/2.
 */
public class MirrorsLogHelper {

    //info日志的路径
    private static final String INFO_LOG_PATH = "mirrors-system|{}|{}|{}";

    //warn日志的路径
    private static final String WARN_LOG_PATH = "mirrors-warn|{}|{}|{}";

    //warn日志的路径
    private static final String DEBUG_LOG_PATH = "mirrors-debug|{}|{}|{}";

    //warn日志的路径
    private static final String ERROR_LOG_PATH = "mirrors-error|{}|{}|{}";

    /**
     *打印info日志
     */
    public static void infoLog(String className, String methodName, String systemInfo){
        MirrorsLog.system.info(INFO_LOG_PATH, className, methodName, systemInfo);
    }


    /**
     *打印warn日志
     */
    public static void warnLog(String className, String methodName, String systemInfo){
        MirrorsLog.system.warn(WARN_LOG_PATH, className, methodName, systemInfo);
    }


    /**
     *打印debug日志
     */
    public static void errorLog(String className, String methodName, String systemInfo){
        MirrorsLog.system.error(DEBUG_LOG_PATH, className, methodName, systemInfo);
    }


    /**
     *打印error日志
     */
    public static void errorLog(String className, String methodName, String systemInfo, Throwable throwable){
        MirrorsLog.system.error(ERROR_LOG_PATH, className, methodName, systemInfo, throwable);
    }

}
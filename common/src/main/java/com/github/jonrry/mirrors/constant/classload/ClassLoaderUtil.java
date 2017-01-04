package com.github.jonrry.mirrors.constant.classload;

import com.github.jonrry.mirrors.constant.log.MirrorsLogHelper;

import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by zongyue.xzy on 17/1/4.
 */
public class ClassLoaderUtil {

    //类缓存器
    private static ConcurrentHashMap<Class<?>,Object> classCache = new ConcurrentHashMap<Class<?>, Object>();

    /**
     * 类加载
     * @param classType
     * @param <T>
     * @return
     */
    public static  <T> T classLoad(Class<T> classType){

        T instance = (T) classCache.get(classType);

        if(instance == null){
            try {
//              ServiceLoader.load(classType, this.getClass().getClassLoader());
                instance  = (T) Class.forName(classType.getName());
                classCache.putIfAbsent(classType, instance);
                return instance;
            }catch (ClassNotFoundException e){
                MirrorsLogHelper.errorLog("ClassLoaderUtil","classLoad","class is not found,className is:"+classType.getName(),e);
            }
        }
        return instance;
    }
}

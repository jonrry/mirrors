package com.github.jonrry.mirrors.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

import java.util.concurrent.TimeUnit;

/**
 * Created by shiru on 16/12/27.
 */
public class LocalCache {

    //存放value的值
    public void putValue() {
        CacheBuilder cacheBuilder = CacheBuilder.newBuilder();
        cacheBuilder.build(new CacheLoader() {
            @Override
            public Object load(Object key) throws Exception {
                return null;
            }
        });


        CacheBuilder.newBuilder()
                .expireAfterAccess(10, TimeUnit.MINUTES)
                .build(
                        new CacheLoader<String, String>() {
                            @Override
                            public String load(String key) throws Exception {
                                return "";
                            }
                        }
                );
    }



}

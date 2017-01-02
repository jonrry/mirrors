package com.github.jonrry.mirrors.utils.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zongyue.xzy on 17/1/2.
 */
public class MirrorsLog {

    /**
     * 系统日志
     */
    public static final Logger system = LoggerFactory.getLogger("mirrors.system");


    /**
     * debug日志
     */
    public static final Logger  debug = LoggerFactory.getLogger("mirrors.debug");

    /**
     * warn日志
     */
    public static final Logger  warn = LoggerFactory.getLogger("mirrors.warn");


    /**
     * error级别日志
     */
    public static final Logger error = LoggerFactory.getLogger("mirrors.error");




}
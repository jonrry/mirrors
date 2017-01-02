package com.github.jonrry.mirrors.utils;

import java.util.Random;

/**
 * Created by zongyue.xzy on 17/1/2.
 */
public class StringUtils {


    /**
     * 随机生成固定长度的字符串
     *
     * @param length
     * @return String
     */
    public static String getRandomString(int length) { // length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 判断字符串数组中是否包含某字符串
     *
     * @param
     * @param needle
     * @return
     */
    public static Boolean isHave(String right, String needle) {
        if (right == null || needle == null)
            return false;
        String[] source = right.split(";");
        for (String s : source) {
            if (s.equals(needle))
                return true;
        }
        return false;
    }

    /**
     * 生成以2开头的随机16位数字串，用于pk
     *
     * @return
     */
    public static String uuid() {
        String timeStamp = String.valueOf(System.currentTimeMillis());
        return "2" + randomNumString(4) + timeStamp.substring(2);
    }

    /**
     * 生成纯数字的随机数
     *
     * @param length
     * @return
     */
    public static final String randomNumString(int length) {
        Random random = new Random(System.nanoTime());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(10);
            sb.append(number);
        }
        return sb.toString();
    }

    /**
     * 检查字符串是否为<code>null</code>或空字符串<code>""</code>。
     *
     * <pre>
     * StringUtil.isEmpty(null) = true
     * StringUtil.isEmpty("") = true
     * StringUtil.isEmpty(" ") = false
     * StringUtil.isEmpty("bob") = false
     * StringUtil.isEmpty("  bob  ") = false
     * </pre>
     *
     * @param str
     *            要检查的字符串
     * @return 如果为空, 则返回<code>true</code>
     */
    public static boolean isEmpty(String str) {
        return ((str == null) || (str.length() == 0));
    }

    public static boolean isInt(String str) {
        if (isEmpty(str)) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

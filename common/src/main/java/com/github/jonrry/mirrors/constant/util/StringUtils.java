package com.github.jonrry.mirrors.constant.util;

/**
 * Created by zongyue.xzy on 17/2/12.
 */
public class StringUtils {

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

package com.dynamic.datasource;

import org.springframework.util.StringUtils;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/8/28
 **/
public class TestStringUtils {
    public static void main(String[] args) {
        String str="aabbccdd";
        String replace = StringUtils.replace(str, "ab", "cd");
        System.out.println(replace);
        int a = StringUtils.countOccurrencesOf(str, "b");
        System.out.println(a);
    }
}

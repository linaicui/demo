package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/11/6
 **/
public class TestProxy {
    public static void main(String[] args) {
        Person instance = (Person) new MeiPo().getInstance(new XiaoXingXing());
        instance.findLove();
    }
}

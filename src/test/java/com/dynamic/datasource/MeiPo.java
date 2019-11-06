package com.dynamic.datasource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/11/6
 **/
public class MeiPo implements InvocationHandler {

    private Person target;

    //获取被代理对象
    public Object getInstance(Person target){
        this.target=target;
        Class<? extends Person> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    //对原方法进行增强
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆");
        System.out.println("你是"+target.getSex());
        target.findLove();
        System.out.println("我这里有个刚好有个符合条件的：林俊敏，17621697911");
        return null;
    }
}

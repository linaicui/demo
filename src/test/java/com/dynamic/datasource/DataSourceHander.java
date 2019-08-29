package com.dynamic.datasource;

import java.lang.reflect.Method;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/8/27
 **/
public class DataSourceHander {
    public void processDataSource(final Class<?> clazz) throws Exception{
        final Object o = clazz.newInstance();
        final Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            final DataSource ds = method.getAnnotation(DataSource.class);
            if (null!=ds){
                method.invoke(o,ds.name());
            }
        }
    }
}

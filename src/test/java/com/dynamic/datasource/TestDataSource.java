package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/8/27
 **/
public class TestDataSource {
    @DataSource
    public static void sayHello(final String name) {
        System.out.println("==>> Hi, " + name + " [sayHello]");
    }

    @DataSource(name = "SecondDataSource")
    public static void sayHelloToSomeone(final String name) {
        System.out.println("==>> Hi, " + name + " [sayHelloToSomeone]");
    }

    public static void main(final String[] args) throws Exception {
        final DataSourceHander dataSourceHander = new DataSourceHander();
        dataSourceHander.processDataSource(TestDataSource.class);
    }

}

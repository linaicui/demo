package com.dynamic.datasource;

import com.dynamic.datasource.model.Car;
import com.dynamic.datasource.model.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/8/22
 **/
public class TestBean {
    @Test
    public void  test1(){

        Car c1 = new Car();
        c1.setBrand("宝马");
        c1.setColor("绿色");
        List<Car> cars = Arrays.asList(c1);
        Product p1 = new Product();
        p1.setId(1L);
        p1.setName("张三");
        p1.setPrice(100L);
        p1.setMar(true);
        p1.setCars(cars);

        Product p2;
        p2=p1;
        c1.setColor("黑色");
        System.out.println(p2.getCars());
    }

    @Test
    public void  test2(){
        Long id=0L;
        Product p1 = new Product();
        Car c1 = new Car();
        c1.setBrand("宝马");
        c1.setColor("绿色");
        List<Car> cars = Arrays.asList(c1);
        p1.setId(id);
        p1.setCars(cars);

        Car c2 = new Car();
        c1.setBrand("路虎");
        c1.setColor("黑色");
        cars.add(c2);
        System.out.println();
    }
}

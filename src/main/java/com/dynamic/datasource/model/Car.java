package com.dynamic.datasource.model;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/8/22
 **/
public class Car {

    private String brand;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

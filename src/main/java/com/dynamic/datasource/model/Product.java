package com.dynamic.datasource.model;

import java.io.Serializable;
import java.util.List;

/**
 * Product bean
 *
 * @author HelloWood
 * @date 2017-07-11 11:09
 * @Email hellowoodes@gmail.com
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1435515995276255188L;

    private Long id;
    private String name;
    private Long price;
    private Boolean isMar;

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Boolean getMar() {
        return isMar;
    }

    public void setMar(Boolean mar) {
        isMar = mar;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}

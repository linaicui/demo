package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/11/6
 **/
public class XiaoXingXing implements Person{

    private String sex="女";
    private String name="小星星";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void findLove() {
        System.out.println("我是"+this.getName()+"，性别：为"+this.getSex());
        System.out.println("我想找个高富帅");
    }
}

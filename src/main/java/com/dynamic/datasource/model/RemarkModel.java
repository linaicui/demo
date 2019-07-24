package com.dynamic.datasource.model;

import java.io.Serializable;

/**
 * 备注解析对象
 * @author zhuhao
 *
 */
public class RemarkModel implements Serializable {

    private static final long serialVersionUID = 1L;
    //类型
    private Integer type;
    //备注值
    private String label;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "RemarkModel{" +
                "type=" + type +
                ", label='" + label + '\'' +
                '}';
    }
}

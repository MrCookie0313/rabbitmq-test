package com.bookingcloud.rabbitmqtest.model;

import lombok.Data;

/**
 * @author Sunbing
 * @date 2019/9/6 11:29
 */
public enum SeasonEunm {
    SPRING("春","春困"),SUMMER("夏","夏睡"),AUTUMN("秋","秋乏");
    private String name;
    private String values;
    private SeasonEunm(String name,String values){
        this.name=name;
        this.values=values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}

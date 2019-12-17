package com.bookingcloud.rabbitmqtest.model;

/**
 * @author Sunbing
 * @date 2019/9/6 11:15
 */
public enum Color {
    RED("1"), GREEN("2"), BLANK("3"), YELLOW("4");
    private String type;
    Color (String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }

}

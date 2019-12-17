package com.bookingcloud.rabbitmqtest.factory;

/**
 * @author Sunbing
 * @date 2019/9/6 15:56
 */
public class M416Shooting implements  Bullet {
    @Override
    public void loading() {
        System.out.println("M416 is loading");
    }
}

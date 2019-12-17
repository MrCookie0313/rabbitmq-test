package com.bookingcloud.rabbitmqtest.factory;

/**
 * @author Sunbing
 * @date 2019/9/6 15:58
 */
public class M416Product implements  Factory {
    @Override
    public Gun productGUN() {
        return new M416();
    }

    @Override
    public Bullet productBullet() {
        return new M416Shooting();
    }
}

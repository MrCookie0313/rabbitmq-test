package com.bookingcloud.rabbitmqtest.factory;

/**
 * @author Sunbing
 * @date 2019/9/6 15:53
 */
public class AKProduct implements Factory{
    @Override
    public Gun productGUN() {
        return new AK();
    }

    @Override
    public Bullet productBullet() {
        return new AKShooting();
    }
}

package com.bookingcloud.rabbitmqtest.factory;

/**
 * @author Sunbing
 * @date 2019/9/6 15:51
 */
public interface Factory {
    Gun productGUN();
    Bullet productBullet();
}

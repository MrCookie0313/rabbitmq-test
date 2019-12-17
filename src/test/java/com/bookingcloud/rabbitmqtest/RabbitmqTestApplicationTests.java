package com.bookingcloud.rabbitmqtest;

import com.bookingcloud.rabbitmqtest.factory.AKProduct;
import com.bookingcloud.rabbitmqtest.factory.Bullet;
import com.bookingcloud.rabbitmqtest.factory.Factory;
import com.bookingcloud.rabbitmqtest.factory.Gun;
import com.bookingcloud.rabbitmqtest.model.Color;
import com.bookingcloud.rabbitmqtest.model.SeasonEunm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTestApplicationTests {

    @Test
    public void contextLoads() {
        String type = Color.YELLOW.getType();
        String values = SeasonEunm.AUTUMN.getValues();
        Factory factory;
        Gun gun;
        Bullet bullet;
        factory = new AKProduct();
        bullet = factory.productBullet();
        bullet.loading();
        gun =factory.productGUN();
        gun.shooting();
        HashMap<?, ?> objectObjectHashMap = new HashMap<>();


    }
    @Test
    public void contextLoads11() {
        new ArrayList()


    }

}

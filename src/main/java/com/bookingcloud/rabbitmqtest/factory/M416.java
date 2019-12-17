package com.bookingcloud.rabbitmqtest.factory;

import org.springframework.amqp.support.postprocessor.GUnzipPostProcessor;

/**
 * @author Sunbing
 * @date 2019/9/6 15:48
 */
public class M416 implements Gun{

    @Override
    public void shooting() {
        System.out.println("shooting is M416");
    }
}

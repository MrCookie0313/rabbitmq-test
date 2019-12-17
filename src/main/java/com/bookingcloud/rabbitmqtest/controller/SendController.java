package com.bookingcloud.rabbitmqtest.controller;

import com.bookingcloud.rabbitmqtest.sender.FirstSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SendController {

    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message) {
        String uuid = UUID.randomUUID().toString();
        firstSender.send(uuid, message);
        return uuid;
    }
}
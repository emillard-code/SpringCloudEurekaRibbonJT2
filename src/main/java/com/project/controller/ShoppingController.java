package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/amazon-payment/{price}")
    public String invokePaymentService(@PathVariable int price) {

        return template.getForObject("http://PAYMENT-SERVICE/payment-provider/payNow/"+price, String.class);

    }

    @GetMapping("/test")
    public String test() {

        return "working....";

    }

}
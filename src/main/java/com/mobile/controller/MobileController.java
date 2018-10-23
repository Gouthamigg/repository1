package com.mobile.controller;

import io.netty.util.internal.ThreadLocalRandom;

import java.time.Duration;

import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController

@RequestMapping("/api/productprice")

public class MobileController {

    @RequestMapping(method = GET, value = "/Iphone")

    int fetchIphonePrice() {

        return 75000;

    }

        /*@RequestMapping(method = GET, value = "/Samsung")

    Flux<String> fetchSamsungPrice() {


        return Flux

                .interval(Duration.ofSeconds(1))

                .map(l -> new Mobile("Samsung Galaxy", ThreadLocalRandom.current().nextInt(40000, 60000)).toString()).log();

    }

       

        @RequestMapping(method = GET, value = "/RedMI")

    Flux<String> fetchRedMIPrice() {

        return Flux

                .interval(Duration.ofSeconds(1))

                .map(l -> new Mobile("RedMI Note", ThreadLocalRandom.current().nextInt(10000, 20000)).toString()).log();

    }*/

       
/*
        @RequestMapping(method = GET, value = "/OnePlus")

    Flux<String> fetchOneplusPrice() {

        return Flux

                .interval(Duration.ofSeconds(1))

                .map(l -> new Mobile("Oneplus 6", ThreadLocalRandom.current().nextInt(30000, 50000)).toString()).log();

    }*/

}
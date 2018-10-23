package com.mobile.controller;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController

@RequestMapping("/api/stockprice")

public class MainController{

   @RequestMapping(method = GET, value = "/PRODUCT")

    Flux<String> callresttemplate()

    {

 

        WebClient webClient2 = WebClient.create("http://localhost:8123/api/productprice/Iphone");

    WebClient webClient1 = WebClient.create("http://localhost:8123/api/productprice/Samsung");

    WebClient webClient3 = WebClient.create("http://localhost:8123/api/productprice/RedMI");

    WebClient webClient4 = WebClient.create("http://localhost:8123/api/productprice/OnePlus");

   

        Flux<String> validUser2= webClient2.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(String.class);

        Flux<String> validUser1= webClient1.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(String.class);

        Flux<String> validUser3= webClient3.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(String.class);

        Flux<String> validUser4= webClient4.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(String.class);

       

        Flux<String> f1=Flux.zip(validUser2, validUser1,(itemFlux2, itemFlux1) ->  itemFlux2 +"/" + itemFlux1);

        Flux<String> f2=Flux.zip(validUser3, validUser4,(itemFlux2, itemFlux1) ->  itemFlux2 +"/" + itemFlux1);

              

        Flux<String> f_combo=Flux.zip(f1, f2,(itemFlux2, itemFlux1) ->  itemFlux2 +"/" + itemFlux1);

        f_combo.subscribe(System.out::print);

         return f_combo;

                      

    }

}
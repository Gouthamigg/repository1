package com.mobile.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mobile {

    private String name;

    private Integer price;

    public static String date_time()

    {

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

         LocalDateTime dateTime = LocalDateTime.now();

         String formattedDateTime = dateTime.format(formatter); // "1986-04-08 12:30"

         return formattedDateTime;

    }

    public Mobile(String name, Integer price) {

        this.name = name;

        this.price = price;

    }   

   

    @Override

    public String toString() {

       return ""+name+":"+price+":"+date_time()+" || ";

    }

}
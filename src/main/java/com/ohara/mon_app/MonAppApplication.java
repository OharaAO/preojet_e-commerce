package com.ohara.mon_app;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class MonAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonAppApplication.class, args);
        System.out.println("Hello World!");
    }

    // definit la time zone de l'application
    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

}


// ohara 
package com.mapping.carmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarmappingApplication {

    public static void main(String[] args) {

        System.out.println(" Inside the Cars Mapping example.");
        SpringApplication.run(CarmappingApplication.class, args);

        /*Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");*/
    }

}

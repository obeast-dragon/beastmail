package com.beast.beastmail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.beast.beastmail.product.dao")
@SpringBootApplication
public class BeastmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailProductApplication.class, args);
    }

}

package com.beast.beastmail.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.beast.beastmail.ware.dao")
@SpringBootApplication
public class BeastmailWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailWareApplication.class, args);
    }

}

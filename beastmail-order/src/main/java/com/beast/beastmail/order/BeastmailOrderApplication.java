package com.beast.beastmail.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.beast.beastmail.order.dao")
@SpringBootApplication
public class BeastmailOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailOrderApplication.class, args);
    }

}

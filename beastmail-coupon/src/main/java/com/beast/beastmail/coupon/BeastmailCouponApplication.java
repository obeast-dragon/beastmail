package com.beast.beastmail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.beast.beastmail.coupon.dao")
@SpringBootApplication
public class BeastmailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailCouponApplication.class, args);
    }

}

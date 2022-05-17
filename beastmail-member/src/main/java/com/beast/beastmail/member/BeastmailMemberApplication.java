package com.beast.beastmail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients("com.beast.beastmail.member.feign")
@EnableDiscoveryClient
@MapperScan("com.beast.beastmail.member.dao")
@SpringBootApplication
public class BeastmailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailMemberApplication.class, args);
    }

}

package com.beast.beastmail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.beast.beastmail.member.dao")
@SpringBootApplication
public class BeastmailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailMemberApplication.class, args);
    }

}

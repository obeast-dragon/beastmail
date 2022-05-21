package com.beast.beastmail.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BeastmailThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeastmailThirdPartyApplication.class, args);
    }

}

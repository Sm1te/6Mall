package com.robin.sixmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.robin.sixmall.member.feign")
@SpringBootApplication
public class SixmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SixmallMemberApplication.class, args);
    }

}

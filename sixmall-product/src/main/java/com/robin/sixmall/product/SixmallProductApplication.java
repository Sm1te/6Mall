package com.robin.sixmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SixmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SixmallProductApplication.class, args);
    }

}

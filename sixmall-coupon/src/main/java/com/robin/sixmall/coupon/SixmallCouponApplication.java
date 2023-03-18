package com.robin.sixmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SixmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SixmallCouponApplication.class, args);
    }

}

package com.shop.server.center.shopservercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ShopServerCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServerCenterApplication.class, args);
    }

}

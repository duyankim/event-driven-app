package com.allonge.couponapi;

import com.allonge.couponcore.CouponCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(CouponCoreConfiguration.class)
@SpringBootApplication
public class CouponApiApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-core,application-apiß");
        SpringApplication.run(CouponApiApplication.class, args);
    }

}

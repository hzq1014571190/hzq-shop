package com.hzq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author hzq
 * @ClassName UserApplication
 * @Path com.hzq.UserApplication
 * @Date 2023/8/5 0:09
 * @Description
 */
@SpringBootApplication
@MapperScan("com.hzq.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}

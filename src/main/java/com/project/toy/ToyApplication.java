package com.project.toy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.project.toy.biz.sample.mapper"})
public class ToyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ToyApplication.class, args);
    }

}

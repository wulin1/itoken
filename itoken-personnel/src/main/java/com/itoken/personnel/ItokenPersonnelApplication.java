package com.itoken.personnel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itoken.personnel.dao")
public class ItokenPersonnelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItokenPersonnelApplication.class, args);
    }

}

package com.xiaopy.mp.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaopy.mp.study.busssiness.mapper")
public class MpStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpStudyApplication.class, args);
    }

}

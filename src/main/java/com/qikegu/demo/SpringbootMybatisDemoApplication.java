package com.qikegu.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qikegu.demo.repository")
public class SpringbootMybatisDemoApplication {

	public static void main(String[] args) {
		System.out.println("Lewis demo2");
		SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
	}
}


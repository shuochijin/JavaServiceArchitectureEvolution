package com.test.TopicSpringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.TopicSpringboot.dao")
public class TopicSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicSpringbootApplication.class, args);
	}
}

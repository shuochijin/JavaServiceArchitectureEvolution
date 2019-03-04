package com.test.TopicSpringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.test.TopicSpringboot.dao")
public class TopicSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicSpringbootApplication.class, args);
	}
}

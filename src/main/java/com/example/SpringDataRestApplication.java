package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringDataRestApplication {

	
	//spring by default knows to db it has to connect to mongo, orcle etc,. by knowing  which driver is in build path
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
}

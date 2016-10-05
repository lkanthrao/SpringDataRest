package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
// main annotation to enable this main method spring boot application
@EnableSwagger2
// enables auto generation of swagger UI for all rest resvices exposed in the
// package, dependency is added in pom.xml
public class SpringDataRestApplication {

	// spring by default knows to db it has to connect to mongo, orcle etc,. by
	// knowing which driver is in build path
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);

		// Static helper that can be used to run a {@link SpringApplication}
		// from the specified source using default settings.
	}
}

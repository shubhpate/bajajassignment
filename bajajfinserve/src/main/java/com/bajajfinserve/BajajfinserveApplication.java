package com.bajajfinserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bajajfinserve")
public class BajajfinserveApplication {

	public static void main(String[] args) {
		SpringApplication.run(BajajfinserveApplication.class, args);
	}

}

package com.appdev.marrk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MarrkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarrkApplication.class, args);
	}

}

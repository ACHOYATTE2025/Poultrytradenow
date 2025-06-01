package com.Business.Poultrytradenow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
public class PoultrytradenowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoultrytradenowApplication.class, args);
	}

}

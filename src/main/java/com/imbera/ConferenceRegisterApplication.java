package com.imbera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ConferenceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceRegisterApplication.class, args);
	}
}

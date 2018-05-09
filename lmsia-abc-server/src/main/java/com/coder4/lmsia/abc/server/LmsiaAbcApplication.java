package com.coder4.lmsia.abc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsiaAbcApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(LmsiaAbcApplication.class);

		// To disabled web environment, change `true` to `false`
		application.setWebEnvironment(true);
		application.run(args);
	}
}

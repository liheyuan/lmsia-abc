package com.coder4.lmsia.abc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author coder4
 */
@SpringBootApplication
@EnableJpaAuditing
public class LmsiaAbcApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(LmsiaAbcApplication.class);

        // To disabled web environment, change `true` to `false`
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}

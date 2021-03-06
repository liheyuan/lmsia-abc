package com.coder4.lmsia.abc.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author coder4
 */
@SpringBootApplication
public class LmsiaAbcJobStarter {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(LmsiaAbcJobStarter.class);
        application.setWebEnvironment(false);
        application.run(args);
    }

}

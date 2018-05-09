package com.coder4.lmsia.abc.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author coder4 
 */
@ConditionalOnProperty(value = "jobs.active", havingValue = "LmsiaAbcJob")
@Service
public class LmsiaAbcJob implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(LmsiaAbcJob.class);

    @Value("${dryRun:#{false}}")
    private boolean dryRun;

    @Override
    public void run(String... args) throws Exception {
        LOG.info("job started LmsiaAbcJob");

        LOG.info("job ended LmsiaAbcJob");
        System.exit(0);
    }

}

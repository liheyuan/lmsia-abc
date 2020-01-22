package com.coder4.lmsia.abc.job;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.thrift.client.ThriftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@ConditionalOnProperty(value = "jobs", havingValue = "LmsiaAbcJob")
@Service
public class LmsiaAbcJob implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(LmsiaAbcJob.class);

    @Value("${dryRun:#{false}}")
    private boolean dryRun;

    @Autowired
    private ThriftClient<LmsiaAbcThrift.Client> client;

    @Override
    public void run(String... args) throws Exception {
        LOG.info("job started LmsiaAbcJob");

        // rpc call
        // LOG.info(client.call(cli -> cli.sayHi()));

        LOG.info("job ended LmsiaAbcJob");
        System.exit(0);
    }

}

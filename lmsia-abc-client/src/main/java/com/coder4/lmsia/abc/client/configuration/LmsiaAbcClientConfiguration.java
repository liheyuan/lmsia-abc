package com.coder4.lmsia.abc.client.configuration;

import com.coder4.lmsia.abc.client.LmsiaAbcEasyClientBuilder;
import com.coder4.lmsia.abc.client.LmsiaAbcEurekaClientBuilder;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.sbmvt.thrift.client.ThriftClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coder4
 */
@Configuration
public class LmsiaAbcClientConfiguration {

    @Bean(name = "lmsiaAbcThriftClient")
    @ConditionalOnMissingBean(name = "lmsiaAbcThriftClient")
    @ConditionalOnProperty(name = {"lmsiaAbcThriftServer.host", "lmsiaAbcThriftServer.port"})
    public ThriftClient<Client> easyClient(
            @Value("${lmsiaAbcThriftServer.host}") String host,
            @Value("${lmsiaAbcThriftServer.port}") int port
    ) {
        // TODO LOG
        return LmsiaAbcEasyClientBuilder.buildClient(host, port);
    }

    @Bean(name = "lmsiaAbcThriftClient")
    @ConditionalOnMissingBean(name = "lmsiaAbcThriftClient")
    public ThriftClient<LmsiaAbcThrift.Client> eurekaClient() {
        // TODO LOG
        return LmsiaAbcEurekaClientBuilder.buildClient("lmsia-abc-thrift-server");
    }

}

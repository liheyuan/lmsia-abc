package com.coder4.lmsia.abc.client.configuration;

import com.coder4.lmsia.abc.client.LmsiaAbcEasyThriftClientBuilder;
import com.coder4.lmsia.abc.client.LmsiaK8ServiceThriftClientBuilder;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.lmsia.thrift.client.K8ServiceKey;
import com.coder4.lmsia.thrift.client.ThriftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static com.coder4.lmsia.abc.constant.LmsiaAbcConstant.K8_SERVICE_NAME;
import static com.coder4.lmsia.abc.constant.LmsiaAbcConstant.K8_SERVICE_PORT;

/**
 * @author coder4
 */
@Configuration
public class LmsiaAbcThriftClientConfiguration {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Bean(name = "lmsiaAbcThriftClient")
    @ConditionalOnMissingBean(name = "lmsiaAbcThriftClient")
    @ConditionalOnProperty(name = {"lmsiaAbcThriftServer.host", "lmsiaAbcThriftServer.port"})
    public ThriftClient<Client> easyThriftClient(
            @Value("${lmsiaAbcThriftServer.host}") String host,
            @Value("${lmsiaAbcThriftServer.port}") int port
    ) {
        LOG.info("######## LmsiaAbcThriftClientConfiguration ########");
        LOG.info("easyThriftClient host = {}, port = {}", host, port);
        return LmsiaAbcEasyThriftClientBuilder.buildClient(host, port);
    }

    @Bean(name = "lmsiaAbcThriftClient")
    @ConditionalOnMissingBean(name = "lmsiaAbcThriftClient")
    public ThriftClient<LmsiaAbcThrift.Client> k8ServiceThriftClient() {
        LOG.info("######## LmsiaAbcThriftClientConfiguration ########");
        K8ServiceKey k8ServiceKey = new K8ServiceKey(K8_SERVICE_NAME, K8_SERVICE_PORT);
        LOG.info("k8ServiceThriftClient key:" + k8ServiceKey);
        return LmsiaK8ServiceThriftClientBuilder.buildClient(k8ServiceKey);
    }

}

package com.coder4.lmsia.abc.client.configuration;

import com.coder4.lmsia.abc.client.LmsiaAbcEasyClientBuilder;
import com.coder4.lmsia.abc.client.LmsiaK8ServiceClientBuilder;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.lmsia.thrift.client.K8ServiceKey;
import com.coder4.lmsia.thrift.client.ThriftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
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
public class LmsiaAbcClientConfiguration {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Bean(name = "lmsiaAbcThriftClient")
    @ConditionalOnMissingBean(name = "lmsiaAbcThriftClient")
    @ConditionalOnProperty(name = {"lmsiaAbcThriftServer.host", "lmsiaAbcThriftServer.port"})
    public ThriftClient<Client> easyClient(
            @Value("${lmsiaAbcThriftServer.host}") String host,
            @Value("${lmsiaAbcThriftServer.port}") int port
    ) {
        LOG.info("######## LmsiaAbcClientConfiguration ########");
        LOG.info("easyClient host = {}, port = {}", host, port);
        return LmsiaAbcEasyClientBuilder.buildClient(host, port);
    }

    @Bean(name = "lmsiaAbcThriftClient")
    @ConditionalOnMissingBean(name = "lmsiaAbcThriftClient")
    public ThriftClient<LmsiaAbcThrift.Client> k8ServiceClient(
            @Qualifier("lmsiaAbcK8ServiceKey") K8ServiceKey k8ServiceKey) {
        LOG.info("######## LmsiaAbcClientConfiguration ########");
        LOG.info("k8ServiceClient key:" + k8ServiceKey);
        return LmsiaK8ServiceClientBuilder.buildClient(k8ServiceKey);
    }

    @Bean(name = "lmsiaAbcK8ServiceKey")
    @Profile("test")
    public K8ServiceKey k8ServiceKeyForTest() {
        return new K8ServiceKey(String.format("%s.test", K8_SERVICE_NAME), K8_SERVICE_PORT);
    }

    @Bean(name = "lmsiaAbcK8ServiceKey")
    @Profile("online")
    public K8ServiceKey k8ServiceKeyForOnline() {
        return new K8ServiceKey(String.format("%s.online", K8_SERVICE_NAME), K8_SERVICE_PORT);
    }

}

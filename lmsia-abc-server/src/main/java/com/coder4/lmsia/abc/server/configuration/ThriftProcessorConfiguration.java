package com.coder4.lmsia.abc.server.configuration;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.abc.server.thrift.ThriftServerHandler;
import org.apache.thrift.TProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coder4
 */
@Configuration
@ConditionalOnProperty(name = "thriftServer.enabled", matchIfMissing = true)
public class ThriftProcessorConfiguration {

    @Bean(name = "thriftProcessor")
    public TProcessor processor(ThriftServerHandler handler) {
        return new LmsiaAbcThrift.Processor(handler);
    }

}

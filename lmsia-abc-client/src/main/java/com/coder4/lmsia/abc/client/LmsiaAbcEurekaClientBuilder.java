package com.coder4.lmsia.abc.client;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.sbmvt.thrift.client.builder.EurekaThriftClientBuilder;
import com.coder4.sbmvt.thrift.client.ThriftClient;

/**
 * @author coder4
 */
public class LmsiaAbcEurekaClientBuilder extends EurekaThriftClientBuilder<LmsiaAbcThrift.Client> {

    public LmsiaAbcEurekaClientBuilder(String serviceName) {
        setThriftClass(LmsiaAbcThrift.class);

        setThriftServiceName(serviceName);
    }

    public static ThriftClient<LmsiaAbcThrift.Client> buildClient(String serviceName) {
        return new LmsiaAbcEurekaClientBuilder(serviceName).build();
    }

}

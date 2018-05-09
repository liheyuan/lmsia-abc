package com.coder4.lmsia.abc.client;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.sbmvt.thrift.client.builder.EasyThriftClientBuilder;
import com.coder4.sbmvt.thrift.client.ThriftClient;

/**
 * @author coder4
 */
public class LmsiaAbcEasyClientBuilder extends EasyThriftClientBuilder<LmsiaAbcThrift.Client> {

    public LmsiaAbcEasyClientBuilder(String host, int port) {
        setThriftClass(LmsiaAbcThrift.class);

        setHost(host);
        setPort(port);
    }

    public static ThriftClient<LmsiaAbcThrift.Client> buildClient(String host, int port) {
        return new LmsiaAbcEasyClientBuilder(host, port).build();
    }

}

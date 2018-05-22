package com.coder4.lmsia.abc.client;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.lmsia.thrift.client.ThriftClient;
import com.coder4.lmsia.thrift.client.builder.EasyThriftClientBuilder;

/**
 * @author coder4
 */
public class LmsiaAbcEasyThriftClientBuilder extends EasyThriftClientBuilder<Client> {

    public LmsiaAbcEasyThriftClientBuilder(String host, int port) {
        setThriftClass(LmsiaAbcThrift.class);

        setHost(host);
        setPort(port);
    }

    public static ThriftClient<Client> buildClient(String host, int port) {
        return new LmsiaAbcEasyThriftClientBuilder(host, port).build();
    }

}

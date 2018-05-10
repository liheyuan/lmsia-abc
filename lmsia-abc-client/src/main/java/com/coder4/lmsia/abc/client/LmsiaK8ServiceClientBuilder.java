package com.coder4.lmsia.abc.client;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.lmsia.thrift.client.K8ServiceKey;
import com.coder4.lmsia.thrift.client.ThriftClient;
import com.coder4.lmsia.thrift.client.builder.K8ServiceThriftClientBuilder;

/**
 * @author coder4
 */
public class LmsiaK8ServiceClientBuilder extends K8ServiceThriftClientBuilder<Client> {

    public LmsiaK8ServiceClientBuilder(K8ServiceKey k8ServiceKey) {
        setThriftClass(LmsiaAbcThrift.class);

        setK8ServiceKey(k8ServiceKey);
    }

    public static ThriftClient<Client> buildClient(K8ServiceKey k8ServiceKey) {
        return new LmsiaK8ServiceClientBuilder(k8ServiceKey).build();
    }

}

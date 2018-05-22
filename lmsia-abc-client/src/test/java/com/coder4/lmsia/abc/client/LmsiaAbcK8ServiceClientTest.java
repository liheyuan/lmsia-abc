/**
 * @(#)MySampleEurekaClientTest.java, Aug 10, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.client;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.lmsia.thrift.client.K8ServiceKey;
import com.coder4.lmsia.thrift.client.ThriftClient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author coder4
 */
public class LmsiaAbcK8ServiceClientTest {

    @Autowired
    private ThriftClient<Client> client;

    public static void main(String[] args) throws InterruptedException {
        K8ServiceKey k8ServiceKey = new K8ServiceKey("lmsia-abc-server.test", 3000);
        ThriftClient<Client> client = LmsiaK8ServiceThriftClientBuilder.buildClient(k8ServiceKey);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            try {
                String str = client.call(cli -> cli.sayHi());
            } catch (Exception e) {
                i--;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}

package com.coder4.lmsia.abc.server.proxy.impl;

import com.coder4.lmsia.abc.server.proxy.intf.AbcProxy;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift.Client;
import com.coder4.lmsia.thrift.client.ThriftClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class AbcProxyImpl implements AbcProxy {

    @Autowired
    private ThriftClient<Client> client;

    @Override
    public String concat(String a, String b) {
        return client.call(cli -> cli.concat(a, b));
    }

}
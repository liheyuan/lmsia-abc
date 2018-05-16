package com.coder4.lmsia.abc.server.thrift;

import com.coder4.lmsia.abc.server.service.intf.HelloService;
import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class ThriftServerHandler implements LmsiaAbcThrift.Iface {

    @Autowired
    private HelloService helloService;

    @Override
    public String sayHi() throws TException {
        return helloService.getHello();
    }

}

package com.coder4.lmsia.abc.server.thrift;

import com.coder4.lmsia.abc.thrift.LmsiaAbcThrift;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class ThriftServerHandler implements LmsiaAbcThrift.Iface {

    @Override
    public String sayHi() throws TException {
        return "Hi, Spring Boot.";
    }

}

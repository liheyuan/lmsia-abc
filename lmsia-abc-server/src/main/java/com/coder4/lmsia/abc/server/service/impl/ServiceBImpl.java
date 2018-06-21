package com.coder4.lmsia.abc.server.service.impl;

import com.coder4.lmsia.abc.server.service.intf.ServiceB;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class ServiceBImpl implements ServiceB {

    @Override
    public int methodB(int a, int b) {
        return 0;
    }
}
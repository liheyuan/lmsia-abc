package com.coder4.lmsia.abc.server.service.impl;

import com.coder4.lmsia.abc.server.service.intf.ServiceA;
import com.coder4.lmsia.abc.server.service.intf.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class ServiceAImpl implements ServiceA {

    @Autowired
    private ServiceB serviceB;

    @Override
    public int methodA(int a, int b) {
        if (a <= 10 && b <= 10) {
            return a + b;
        } else {
            return serviceB.methodB(a, b);
        }
    }
}
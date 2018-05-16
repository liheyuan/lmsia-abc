/**
 * @(#)HelloServiceImpl.java, May 16, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.service.impl;

import com.coder4.lmsia.abc.server.service.intf.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "Hello, Spring Boot Service.";
    }
}
package com.coder4.lmsia.abc.server.service.impl;

import com.coder4.lmsia.abc.server.service.intf.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class HelloServiceImpl implements HelloService {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Override
    public String getHello() {
        return "Hello, Spring Boot Service.";
    }

    @Override
    public String concat(String a, String b) {
        LOG.info("concat a = {}, b = {}", a, b);
        return a + b;
    }
}
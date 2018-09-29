package com.coder4.lmsia.abc.server.rest.controller;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.configuration.TestConfig;
import com.coder4.lmsia.abc.server.rest.logic.intf.AbcLogic;
import com.coder4.lmsia.hystrix.BaseHystrixCommend;
import com.coder4.lmsia.ratelimit.MethodParamRateLimit;
import com.coder4.lmsia.ratelimit.MethodRateLimit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder4
 */
@RestController
@RequestMapping(LmsiaAbcConstant.REST_API)
public class AbcController {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private AbcLogic abcLogic;

    @Autowired
    private TestConfig testConfig;

    @MethodParamRateLimit(permitsPerSecond = 1, paramIndex = 0)
    @GetMapping(value = "/ids/{id}")
    public String helloWithId(@PathVariable int id) {
        return helloFallback();
    }

    @MethodRateLimit(permitsPerSecond = 2.0)
    @GetMapping(value = "/")
    public String hello() {
        return new BaseHystrixCommend<String>("abc", this::helloReal, this::helloFallback).execute();
    }

    private String helloReal() {
        LOG.info("config key = {}, enable = {}", testConfig.getKey(), testConfig.isEnable());
        LOG.info("before");
        if (true) {
            throw new RuntimeException("haha");
        }
        return abcLogic.getHello();
    }

    public String helloFallback() {
        LOG.info("hello fb");
        return "Hello, fallback";
    }


}
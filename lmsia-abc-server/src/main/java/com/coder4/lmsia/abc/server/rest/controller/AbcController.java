package com.coder4.lmsia.abc.server.rest.controller;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.rest.logic.intf.AbcLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value = "/")
    public String hello() {
        LOG.info("before");
        if (true) {
            throw new RuntimeException("haha");
        }
        return abcLogic.getHello();
    }


}
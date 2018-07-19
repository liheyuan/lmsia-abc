package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.rest.logic.intf.AbcLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class AbcLogicImpl implements AbcLogic {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Override
    public String getHello() {
        LOG.info("hehe");
        return "Hello, REST";
    }
}
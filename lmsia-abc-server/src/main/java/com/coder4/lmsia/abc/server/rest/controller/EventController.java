/**
 * @(#)EventController.java, Jul 05, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.controller;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.rest.logic.intf.EventLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder4
 */
@RestController
@RequestMapping(LmsiaAbcConstant.REST_API)
public class EventController {

    @Autowired
    private EventLogic eventLogic;

    @PostMapping(value = "/event")
    public void send() {
        eventLogic.sendEvent();
    }

}
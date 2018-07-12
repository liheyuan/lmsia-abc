package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.data.MyEvent;
import com.coder4.lmsia.abc.server.rest.logic.intf.EventLogic;
import com.coder4.lmsia.abc.server.rocketmq.intf.MyEventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class EventLogicImpl implements EventLogic {

    @Autowired
    private MyEventHandler myEventHandler;

    @Override
    public void sendEvent() {
        for (int i = 0; i < 500; i++) {
            myEventHandler.send(new MyEvent(i));
        }
    }
}
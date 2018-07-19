package com.coder4.lmsia.abc.server.rocketmq.intf;

import com.coder4.lmsia.abc.server.data.MyEvent;

/**
 * @author coder4
 */
public interface MyEventHandler {

    void send(MyEvent event);

}
/**
 * @(#)MsgService.java, Jul 05, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rocketmq.intf;

import com.coder4.lmsia.abc.server.data.MyEvent;

/**
 * @author coder4
 */
public interface MyEventHandler {

    void send(MyEvent event);


}
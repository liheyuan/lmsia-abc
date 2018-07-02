/**
 * @(#)RedisLogic.java, Jul 02, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.logic.intf;

import java.util.List;

/**
 * @author coder4
 */
public interface RedisLogic {

    void add();

    List<Long> getList();

}
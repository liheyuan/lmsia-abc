/**
 * @(#)AbcLogicImpl.java, May 16, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.rest.logic.intf.AbcLogic;

/**
 * @author coder4
 */
public class AbcLogicImpl implements AbcLogic {

    @Override
    public String getHello() {
        return "Hello, REST";
    }
}
/**
 * @(#)UserLogic.java, Jun 20, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.logic.intf;

import com.coder4.lmsia.abc.server.rest.data.UserVO;

/**
 * @author coder4
 */
public interface UserLogic {

    UserVO getUser(int userId);

    void addUser(UserVO user);
}
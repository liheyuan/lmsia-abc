/**
 * @(#)UserWrapper.java, Jun 20, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.wrapper;

import com.coder4.lmsia.abc.server.data.UserForJpa;
import com.coder4.lmsia.abc.server.rest.data.UserVO;

/**
 * @author coder4
 */
public class UserForJpaWrapper {

    public static UserVO wrap(UserForJpa user) {
        UserVO vo = new UserVO();
        vo.setId((int)user.getId());
        vo.setName(user.getName());
        return vo;
    }

    public static UserForJpa unwrap(UserVO vo) {
        UserForJpa user = new UserForJpa();
        user.setId(vo.getId());
        user.setName(vo.getName());
        user.setCreatedTime(System.currentTimeMillis());
        user.setUpdatedTime(System.currentTimeMillis());
        return user;
    }
}
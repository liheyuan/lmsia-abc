/**
 * @(#)UserLogicImpl.java, Jun 20, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.data.User;
import com.coder4.lmsia.abc.server.repository.intf.UserRepository;
import com.coder4.lmsia.abc.server.rest.data.UserVO;
import com.coder4.lmsia.abc.server.rest.logic.intf.UserLogic;
import com.coder4.lmsia.abc.server.rest.wrapper.UserWrapper;
import com.coder4.lmsia.commons.http.exception.Http404NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class UserLogicImpl implements UserLogic {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserVO getUser(int userId) {
        User user = userRepository.getUserById(userId)
                .orElseThrow(() -> new Http404NotFoundException());
        return UserWrapper.wrap(user);
    }

    @Override
    public void addUser(UserVO user) {
        userRepository.add(UserWrapper.unwrap(user));
    }
}
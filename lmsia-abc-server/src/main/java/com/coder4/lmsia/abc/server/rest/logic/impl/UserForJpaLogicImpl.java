/**
 * @(#)UserForJpaLogicImpl.java, Jun 21, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.data.UserForJpa;
import com.coder4.lmsia.abc.server.repository.intf.UserJpaRepository;
import com.coder4.lmsia.abc.server.rest.data.UserVO;
import com.coder4.lmsia.abc.server.rest.logic.intf.UserForJpaLogic;
import com.coder4.lmsia.abc.server.rest.wrapper.UserForJpaWrapper;
import com.coder4.lmsia.commons.http.exception.Http404NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author coder4
 */
@Service
public class UserForJpaLogicImpl implements UserForJpaLogic {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public UserVO getUser(long userId) {
//        UserForJpa user = Optional.ofNullable(userJpaRepository.findOne(userId))
//                .orElseThrow(() -> new Http404NotFoundException());
        UserForJpa user = userJpaRepository.findUserById(userId)
                .orElseThrow(() -> new Http404NotFoundException());
        return UserForJpaWrapper.wrap(user);
    }

    @Override
    public void addUser(UserVO user) {
        userJpaRepository.save(UserForJpaWrapper.unwrap(user));
    }
}
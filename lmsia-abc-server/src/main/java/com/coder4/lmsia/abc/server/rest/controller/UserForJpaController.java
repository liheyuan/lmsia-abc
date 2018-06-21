package com.coder4.lmsia.abc.server.rest.controller;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.rest.data.UserVO;
import com.coder4.lmsia.abc.server.rest.logic.intf.UserForJpaLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder4
 */
@RestController
@RequestMapping(LmsiaAbcConstant.REST_API + "/users-jpa")
public class UserForJpaController {

    @Autowired
    private UserForJpaLogic userForJpaLogic;

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public UserVO getUser(@PathVariable long userId) {
        return userForJpaLogic.getUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void getUser(@RequestBody UserVO user) {
        userForJpaLogic.addUser(user);
    }

}
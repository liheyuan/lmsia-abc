package com.coder4.lmsia.abc.server.rest.controller;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.rest.data.UserVO;
import com.coder4.lmsia.abc.server.rest.logic.intf.UserLogic;
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
@RequestMapping(LmsiaAbcConstant.REST_API + "/users")
public class UserController {

    @Autowired
    private UserLogic userLogic;

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public UserVO getUser(@PathVariable int userId) {
        return userLogic.getUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void getUser(@RequestBody UserVO user) {
        userLogic.addUser(user);
    }

}
package com.coder4.lmsia.abc.server.rest.controller;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.rest.logic.intf.CacheLogic;
import com.coder4.lmsia.abc.server.rest.logic.intf.RedisLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author coder4
 */
@RestController
@RequestMapping(LmsiaAbcConstant.REST_API)
public class RedisController {

    @Autowired
    private RedisLogic redisLogic;

    @PostMapping(value = "/redis")
    public void add() {
        redisLogic.add();
    }

    @GetMapping(value = "/redis")
    public List<Long> get() {
        return redisLogic.getList();
    }

}
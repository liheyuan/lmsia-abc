package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.redis.intf.MyListRepository;
import com.coder4.lmsia.abc.server.rest.logic.intf.RedisLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author coder4
 */
@Service
public class RedisLogicImpl implements RedisLogic {

    @Autowired
    private MyListRepository myListRepository;

    @Override
    public void add() {
        myListRepository.add(0, System.currentTimeMillis());
    }

    @Override
    public List<Long> getList() {
        return myListRepository.get(0);
    }
}
package com.coder4.lmsia.abc.server.redis.impl;

import com.coder4.lmsia.abc.server.redis.intf.MyListRepository;
import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.LongCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coder4
 */
@Service
public class MyListRedissonImpl implements MyListRepository {

    @Autowired
    private RedissonClient redissonClient;

    private static String getKey(int userId) {
        return String.format("list:%d", userId);
    }

    private RSet<Long> obtainSet(int userId) {
        return redissonClient.getSet(getKey(userId), new LongCodec());
    }

    @Override
    public List<Long> get(int userId) {
        return new ArrayList(obtainSet(userId).readAll());
    }

    @Override
    public void add(int userId, long data) {
        obtainSet(userId).add(data);
    }
}
package com.coder4.lmsia.abc.server.rest.logic.impl;

import com.coder4.lmsia.abc.server.memcached.TimestampMemcachedCache;
import com.coder4.lmsia.abc.server.rest.logic.intf.CacheLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class CacheLogicImpl implements CacheLogic {

    @Autowired
    private TimestampMemcachedCache cache;

    @Override
    public String getCacheTimestamp() {
        return String.valueOf(cache.cacheGet(1, key -> System.currentTimeMillis(), 10));
    }
}
package com.coder4.lmsia.abc.server.memcached;

import com.coder4.sbmvt.cache.AbstractMemcachedCache;
import com.coder4.sbmvt.cache.transfomer.key.CacheKeyTransformer;
import com.coder4.sbmvt.cache.transfomer.key.DefaultCacheKeyTransformer;
import com.coder4.sbmvt.cache.transfomer.value.CacheValueTransformer;
import com.coder4.sbmvt.cache.transfomer.value.LongValueTransformer;
import net.rubyeye.xmemcached.MemcachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
public class TimestampMemcachedCache extends AbstractMemcachedCache<Integer, Long> {

    @Autowired
    private MemcachedClient client;

    private CacheKeyTransformer<Integer> keyTransformer = new DefaultCacheKeyTransformer<>("timestamp");

    private CacheValueTransformer<Long> valueTransformer = new LongValueTransformer();

    @Override
    protected MemcachedClient getMemcachedClient() {
        return client;
    }

    @Override
    protected CacheKeyTransformer<Integer> getKeyTransformer() {
        return keyTransformer;
    }

    @Override
    protected CacheValueTransformer<Long> getValueTransformer() {
        return valueTransformer;
    }
}
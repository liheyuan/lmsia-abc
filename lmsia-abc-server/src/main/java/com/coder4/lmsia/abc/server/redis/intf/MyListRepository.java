package com.coder4.lmsia.abc.server.redis.intf;

import java.util.List;

/**
 * @author coder4
 */
public interface MyListRepository {

    List<Long> get(int userId);

    void add(int userId, long data);

}
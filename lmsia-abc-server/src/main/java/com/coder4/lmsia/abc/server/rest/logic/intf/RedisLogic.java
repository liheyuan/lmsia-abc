package com.coder4.lmsia.abc.server.rest.logic.intf;

import java.util.List;

/**
 * @author coder4
 */
public interface RedisLogic {

    void add();

    List<Long> getList();

}
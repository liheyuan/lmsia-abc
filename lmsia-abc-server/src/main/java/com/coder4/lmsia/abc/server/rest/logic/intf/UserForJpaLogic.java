package com.coder4.lmsia.abc.server.rest.logic.intf;

import com.coder4.lmsia.abc.server.rest.data.UserVO;

/**
 * @author coder4
 */
public interface UserForJpaLogic {

    UserVO getUser(long userId);

    void addUser(UserVO user);
}
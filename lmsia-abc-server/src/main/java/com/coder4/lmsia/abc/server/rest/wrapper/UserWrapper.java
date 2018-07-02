package com.coder4.lmsia.abc.server.rest.wrapper;

import com.coder4.lmsia.abc.server.data.User;
import com.coder4.lmsia.abc.server.rest.data.UserVO;

/**
 * @author coder4
 */
public class UserWrapper {

    public static UserVO wrap(User user) {
        UserVO vo = new UserVO();
        vo.setId(user.getId());
        vo.setName(user.getName());
        return vo;
    }

    public static User unwrap(UserVO vo) {
        User user = new User();
        user.setId(vo.getId());
        user.setName(vo.getName());
        user.setCreatedTime(System.currentTimeMillis());
        user.setUpdatedTime(System.currentTimeMillis());
        return user;
    }
}
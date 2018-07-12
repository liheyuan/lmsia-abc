package com.coder4.lmsia.abc.server.repository.intf;

import com.coder4.lmsia.abc.server.data.User;

import java.util.Optional;

/**
 * @author coder4
 */
public interface UserRepository {

    void add(User user);

    Optional<User> getUserById(int id);

}
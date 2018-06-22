/**
 * @(#)AbcRepository.java, Jun 20, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.repository.intf;

import com.coder4.lmsia.abc.server.data.UserForJpa;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author coder4
 */
@Repository
public interface UserJpaRepository extends JpaRepository<UserForJpa, Long> {

    @Query(
            value = "SELECT * FROM `user` ORDER BY `id` DESC LIMIT 1",
            nativeQuery = true)
    Optional<UserForJpa> findLatestUser();

    @Query(
            value = "SELECT * FROM `user` WHERE `id` = ?1",
            nativeQuery = true)
    Optional<UserForJpa> findUserById(long userId);

}
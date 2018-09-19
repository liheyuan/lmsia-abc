package com.coder4.lmsia.abc.server.repository.impl;

import com.coder4.lmsia.abc.server.data.User;
import com.coder4.lmsia.abc.server.repository.intf.BaseRepository;
import com.coder4.lmsia.abc.server.repository.intf.UserRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * @author coder4
 */
@Repository
public class UserRepositoryImpl extends BaseRepository implements UserRepository {

    private RowMapper<User> ROW_MAPPER = new BeanPropertyRowMapper(User.class);

    @Override
    public void add(User user) {
        String sql = "INSERT INTO `user`(`name`, `createdTime`, `updatedTime`) VALUES " +
                "(:name, :createdTime, :updatedTime)";
        SqlParameterSource param = new BeanPropertySqlParameterSource(user);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        db.update(sql, param, keyHolder);
        LOG.info("insert succ, id = {}", keyHolder.getKey().longValue());
    }

    @Override
    public Optional<User> getUserById(int id) {
        String sql = "SELECT * FROM `user` WHERE `id` = :id";
        SqlParameterSource param = new MapSqlParameterSource("id", id);
        try {
            return Optional.ofNullable(db.queryForObject(sql, param, ROW_MAPPER));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
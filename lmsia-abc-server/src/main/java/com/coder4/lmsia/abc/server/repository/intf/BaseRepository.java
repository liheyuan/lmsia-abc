package com.coder4.lmsia.abc.server.repository.intf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * @author coder4
 */
public class BaseRepository {

    protected Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected NamedParameterJdbcTemplate db;

}
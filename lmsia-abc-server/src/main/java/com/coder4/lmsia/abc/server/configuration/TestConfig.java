package com.coder4.lmsia.abc.server.configuration;

import com.coder4.lmsia.cfg4j.Cfg4jValue;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author coder4
 */
@Service
@Data
public class TestConfig {

    @Cfg4jValue
    private String key;

    @Cfg4jValue
    private boolean enable;

}
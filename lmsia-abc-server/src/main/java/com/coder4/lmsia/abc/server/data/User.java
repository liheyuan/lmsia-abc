/**
 * @(#)Abc.java, Jun 20, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.data;

import lombok.Data;

/**
 * @author coder4
 */
@Data
public class User {

    private int id;

    private String name;

    private long createdTime;

    private long updatedTime;

}
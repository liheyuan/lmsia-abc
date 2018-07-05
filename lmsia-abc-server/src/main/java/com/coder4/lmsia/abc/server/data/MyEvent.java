/**
 * @(#)Message.java, Jul 05, 2018.
 * <p>
 * Copyright 2018 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.lmsia.abc.server.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author coder4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyEvent implements Serializable {

    private long data;

}
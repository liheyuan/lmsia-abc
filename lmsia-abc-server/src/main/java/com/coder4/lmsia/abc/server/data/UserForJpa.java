package com.coder4.lmsia.abc.server.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author coder4
 */
@Data
@Entity
@Table(name = "user")
public class UserForJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, updatable = false)
    private long createdTime;

    @Column(nullable = false)
    private long updatedTime;

}
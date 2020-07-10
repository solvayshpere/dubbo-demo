package com.hpuswl.dubbo.springboot.bean;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 6032597466598480122L;
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

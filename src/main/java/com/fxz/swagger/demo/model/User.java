package com.fxz.swagger.demo.model;

import io.swagger.annotations.ApiModel;

/**
 * @author Fang
 * @date 2021-01-06 15:37:53
 */
@ApiModel("用户实体")
public class User {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户地址
     */
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

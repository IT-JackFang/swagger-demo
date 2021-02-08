package com.fxz.swagger.demo.controller;

import com.fxz.swagger.demo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fang
 * @date 2021-01-06 15:37:27
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", description = "提供用户相关的Rest API")
public class UserController {

    @ApiOperation("新增用户接口")
    @PostMapping("add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation("通过ID查找用户接口")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新用户信息接口")
    @PostMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @ApiOperation("删除用户信息接口")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }

}

package com.baomidou.mybatisplus.samples.enums.controller;

import com.baomidou.mybatisplus.samples.enums.entity.User;
import com.baomidou.mybatisplus.samples.enums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/21 16:36
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/all")
    public List<User> getAllUsers() {
        List<User> allUses = userService.getAllUses();
        return allUses;
    }

    @RequestMapping("/insert")
    public String insertUser(@RequestBody User user) {
        userService.insertUser(user);
        return "insert success";
    }
}

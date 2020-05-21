package com.baomidou.mybatisplus.samples.enums.service;

import com.baomidou.mybatisplus.samples.enums.entity.User;
import com.baomidou.mybatisplus.samples.enums.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/21 16:34
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUses() {
        List<User> userList = userMapper.selectList(null);
        return userList;
    }

    public void insertUser(User user) {
        userMapper.insert(user);
    }


}

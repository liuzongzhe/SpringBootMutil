package com.lzz.service.impl;

import com.lzz.mapper.UserMapper;
import com.lzz.pojo.User;
import com.lzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author lzz
 * Date   2018/5/23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}

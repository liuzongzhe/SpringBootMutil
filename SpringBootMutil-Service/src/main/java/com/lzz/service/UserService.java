package com.lzz.service;

import com.lzz.pojo.User;

import java.util.List;

/**
 * Author lzz
 * Date   2018/5/23
 */
public interface UserService {

    void insert(User user);

    List<User> findAll();
}

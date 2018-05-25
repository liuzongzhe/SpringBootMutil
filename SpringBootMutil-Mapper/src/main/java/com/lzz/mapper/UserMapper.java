package com.lzz.mapper;

import com.lzz.pojo.User;

import java.util.List;

/**
 * Author lzz
 * Date   2018/5/23
 */
public interface UserMapper {

    void insert(User user);

    List<User> findAll();

}

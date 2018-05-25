package com.lzz.controller;

import com.lzz.pojo.User;
import com.lzz.service.UserService;
import com.lzz.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author lzz
 * Date   2018/5/23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert() {
        User user = new User();
        user.setId(IDUtils.uuid());
        user.setUsername("张三");
        user.setPassword("123");
        userService.insert(user);
        return "insert success";
    }
}

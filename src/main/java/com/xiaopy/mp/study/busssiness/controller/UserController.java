package com.xiaopy.mp.study.busssiness.controller;

import com.xiaopy.mp.study.busssiness.domain.User;
import com.xiaopy.mp.study.busssiness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2019/8/21
 */
@RestController
@RequestMapping("/mp")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> ListUsers(){
        return userService.listUsers();
    }
}

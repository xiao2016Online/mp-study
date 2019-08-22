package com.xiaopy.mp.study.busssiness.service;

import com.xiaopy.mp.study.busssiness.domain.User;
import com.xiaopy.mp.study.busssiness.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2019/8/21
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> listUsers() {
        return mapper.selectList(null);
    }
}

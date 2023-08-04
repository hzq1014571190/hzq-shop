package com.hzq.service.impl;

import com.hzq.mapper.UserMapper;
import com.hzq.model.User;
import com.hzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hzq
 * @ClassName UserServiceImpl
 * @Path com.hzq.service.impl.UserServiceImpl
 * @Date 2023/8/4 23:58
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getDetailById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

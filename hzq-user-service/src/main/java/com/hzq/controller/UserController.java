package com.hzq.controller;

import com.hzq.model.User;
import com.hzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hzq
 * @ClassName UserController
 * @Path com.hzq.controller.UserController
 * @Date 2023/8/5 0:13
 * @Description
 */
@RestController
@RequestMapping("/api/user/v1")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/detail/{id}")
    public User detail(@PathVariable Long id) {
        return userService.getDetailById(id);
    }

}

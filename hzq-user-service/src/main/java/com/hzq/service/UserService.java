package com.hzq.service;

import com.hzq.model.User;

/**
 * @Author hzq
 * @InterfaceName UserService
 * @Path com.hzq.service.UserService
 * @Date 2023/8/4 23:58
 * @Description
 */
public interface UserService {
    User getDetailById(Long id);
}

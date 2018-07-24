package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.client.UserService;

import java.util.UUID;

/**
 * Created by yang_gao on 2018/7/24.
 */

@Service(version = "0.0.1", timeout = 50000000, retries = 1)
public class UserServiceImpl implements UserService {
    @Override
    public String healthCheck() {
        return "ok";
    }

    @Override
    public String getToken() {
        return UUID.randomUUID().toString();
    }

    @Override
    public boolean isValidUserId(String uid) {
        return false;
    }
}

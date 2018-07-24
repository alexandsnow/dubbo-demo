package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.client.OrderService;

import java.util.UUID;

/**
 * Created by yang_gao on 2018/7/24.
 */

@Service(version = "0.0.1", timeout = 5000000, retries = 1)
public class OrderServiceImpl implements OrderService {
    @Override
    public String genOrderFlow() {
        return UUID.randomUUID().toString();
    }
}

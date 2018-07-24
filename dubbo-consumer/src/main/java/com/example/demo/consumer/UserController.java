package com.example.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.client.OrderService;
import com.example.client.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang_gao on 2018/7/24.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "0.0.1")
    UserService userService;

    @Reference(version = "0.0.1")
    OrderService orderService;

    @GetMapping("/{uid}")
    public String getUser(@PathVariable("uid") String uid) {
        System.out.println(userService.getToken());
        return orderService.genOrderFlow();
    }
}

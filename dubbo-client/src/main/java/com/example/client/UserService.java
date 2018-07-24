package com.example.client;

/**
 * Created by yang_gao on 2018/7/24.
 */

public interface UserService {
    String healthCheck();
    String getToken();
    boolean isValidUserId(String uid);
}

package com.tian.service;

import org.apache.dubbo.config.annotation.Service;

@Service(protocol = "dubbo")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String message) {
        System.out.println("provider  received msg = " + message);
        return "provider already received ";
    }
}

package com.example.springdemowebMVC.repo;

import com.example.springdemowebMVC.model.CustomerLoginDTO;

public interface CustomerLoginRepo {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}

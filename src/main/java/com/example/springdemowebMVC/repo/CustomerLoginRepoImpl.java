package com.example.springdemowebMVC.repo;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.springdemowebMVC.model.CustomerLoginDTO;

import java.util.HashMap;

@Repository
public class CustomerLoginRepoImpl implements CustomerLoginRepo{
    
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName){
        Map<String, String> customerCredentials = new HashMap<String, String>();
        customerCredentials.put("tom","tom123");
        customerCredentials.put("raj","raj123");

        CustomerLoginDTO customerLogin = new CustomerLoginDTO(loginName, customerCredentials.get(loginName));
        return customerLogin;
    }
}

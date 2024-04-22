package com.example.springdemowebMVC.service;

import com.example.springdemowebMVC.model.CustomerLoginDTO;
import com.example.springdemowebMVC.service.CustomerLoginService;

public interface CustomerLoginService{
    public String authenticateCustomer(CustomerLoginDTO customerLoginDTO);
}
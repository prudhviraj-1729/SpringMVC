package com.example.springdemowebMVC.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemowebMVC.model.CustomerLoginDTO;
import com.example.springdemowebMVC.repo.CustomerLoginRepo;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{
    
    @Autowired
    CustomerLoginRepo customerLoginRepo;

    @Override
    public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) {
        String toReturn = null;
        CustomerLoginDTO customerFromRepo = customerLoginRepo.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
        if (customerLoginDTO.getPassword().equals(customerFromRepo.getPassword())){
            toReturn = "success";
        } else {
            toReturn = "fail";
        }
        return toReturn;
    }
    
}

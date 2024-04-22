package com.example.springdemowebMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springdemowebMVC.model.CustomerLoginDTO;
import com.example.springdemowebMVC.service.CustomerLoginService;

@RestController
@RequestMapping(value="/banking")
public class CustomerLoginController {
    
    @Autowired
    CustomerLoginService service;

    @GetMapping(value="/testing")
    public String testint(){
        return "Hello World!";
    }

    @GetMapping(value="/login")
    public ModelAndView authenticateCustomer(@RequestParam String name, @RequestParam String password){
        CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
        customerLoginDTO.setLoginName(name);
        customerLoginDTO.setPassword(password);
        String res = service.authenticateCustomer(customerLoginDTO);
        if (res.equals("success")){
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("username", name);
            System.out.println(res);
            System.out.println(modelAndView);
            return modelAndView;
        } else {
            return new ModelAndView("error");
        }
    }
}

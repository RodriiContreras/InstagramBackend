package com.example.demo.services;


import com.example.demo.entities.User;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CustomerServices implements ICustomerService {
    private ICustomerService services;

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/api/user")

    @Override
    public List<User> getAll(){
     return (List<User>) repository.findAll();
    }


}

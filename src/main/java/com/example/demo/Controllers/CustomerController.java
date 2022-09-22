package com.example.demo.Controllers;

import com.example.demo.entities.User;
import com.example.demo.services.ICustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CustomerController {

    private ICustomerService service;

    @GetMapping("/api/customers")

    public List<User> getAll(){
        return service.getAll();
    }
}

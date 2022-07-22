package com.example.demo.cust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerDataController {
    @Autowired
    private CustomerDataService service;

    @GetMapping("/CustomerData")
    public List<CustomerData> getData(){
        return service.getAllData();
    }

    @PostMapping("/CustomerData")
    public CustomerData saveData(@RequestBody CustomerData Data) {
        return service.addData(Data);
    }

}

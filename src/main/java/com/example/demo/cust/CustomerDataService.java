package com.example.demo.cust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDataService {
    @Autowired
    private CustomerDataRepository repository;


    public CustomerData addData(CustomerData Data) {
        return repository.save(Data);
    }

    public List<CustomerData> getAllData() {
        return repository.findAll();
    }
}

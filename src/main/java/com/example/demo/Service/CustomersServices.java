package com.example.demo.Service;

import com.example.demo.Entity.Customers;
import com.example.demo.Repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersServices {
    @Autowired
    CustomersRepository customersRepository;

    public void saveCus(){
        Customers customer1 = new Customers(1, "Test Name 1", "Surname 1");

        customersRepository.save(customer1);
    }

    public void save(Customers customers){
        customersRepository.save(customers);
    }
}
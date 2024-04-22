package com.example.demo.Service;


import com.example.demo.Entity.Customers;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.CustomersRepository;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MainService {

        @Autowired
        EmployeeRepository employeeRepository;

        @Autowired
        CustomersRepository customersRepository;

        List<Employee> emp = Arrays.asList(
                new Employee(2, "Test name2", "Test surname2"),
                new Employee(3, "Test name3", "test surname3")
        );

        public List<Employee> getEmp(){
                return emp;
        }

        List<Customers> customers = Arrays.asList(
                new Customers(2, "Test Name 2", "Test Surname 2"),
                new Customers(3, "Test Name 3", "Test surname 3")
        );

        public List<Customers> getCustomers(){
                return customers;
        }


}

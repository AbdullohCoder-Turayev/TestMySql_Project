package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public  void saveEmp(){
        Employee emp1 = new Employee(1, "Mirzo", "Kamoldinov");



        employeeRepository.save(emp1);
    }

    public void save(Employee employee){

        employeeRepository.save(employee);
    }

    public List<Employee> findAllEmp(){
       return employeeRepository.findAll();
    }

    public Employee findEmpById(int id){
        Optional<Employee> emp = employeeRepository.findById(id);

        return emp.orElse(null);
    }
}

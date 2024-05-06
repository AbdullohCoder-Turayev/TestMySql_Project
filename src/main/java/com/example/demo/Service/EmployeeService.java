package com.example.demo.Service;

import com.example.demo.DTO.EmployeeDTO;
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
        Employee emp = employeeRepository.findById(id);

        return emp;
    }

    public Employee changeEmpNameById(int id){
        Employee emp = employeeRepository.findById(id);


        emp.setName("Edited Name");
        emp.setSurname("edited suranme");
        employeeRepository.save(emp);

        return emp;
    }

    public void saveDto(EmployeeDTO employeeDTO){
        Employee emp = new Employee();

        emp.setName(employeeDTO.getName());
        emp.setSurname(employeeDTO.getSurname());

        employeeRepository.save(emp);
    }
}

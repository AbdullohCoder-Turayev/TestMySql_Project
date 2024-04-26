package com.example.demo.Controller;


import com.example.demo.Entity.Customers;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Students;
import com.example.demo.Service.CustomersServices;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.MainService;
import com.example.demo.Service.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    CustomersServices customersServices;

    @Autowired
    StudentsServices studentsServices;

    @GetMapping("/main")
    public String showMain(){



        return "index";
    }

    @GetMapping("/getEmployee")
    public List<Employee> getAllemp(){

        return mainService.getEmp();
    }

    @GetMapping("/save")
    public void saveEmp(){
        employeeService.saveEmp();


    }

    @GetMapping("/employee")
    public String showForm(Model model){
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/employee")
    public String submitEmpForm(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";

    }

    @GetMapping("/customers")
    public String showForm1(Model model){
        model.addAttribute("customers", new Customers());
        return "page1";
    }

    @PostMapping("/customers")
    public String submitCustomerForm(@ModelAttribute("customers") Customers customers) {
        customersServices.save(customers);
        return "redirect:/customers";

    }



    @GetMapping("/mark_the_student")
    public String showRegPage(Model model){
        model.addAttribute("students", new Students());
        return "students_marking_page";
    }

    @PostMapping("/mark_the_student")
    public String submitStudRegForm(@ModelAttribute("students") Students students) {
        studentsServices.save(students);
        return "redirect:/mark_the_student";
    }

    @GetMapping("/remove_all_students")
    public String removeAllStud(){
        studentsServices.clearStudents();

        return "remove_all_students";
    }

    @GetMapping("/students/remove/{id}")
    public String removeById(@PathVariable int id){

        studentsServices.removeStudentById(id);
        return "redirect:/mark_the_student";
    }

    @GetMapping("/showallemp")
    public String showAllEmp(Model model){
        for (Employee emp : employeeService.findAllEmp()){
            System.out.println(emp.getName() + "  " + emp.getSurname());
        }

        model.addAttribute("employee", employeeService.findAllEmp());

        return "employee";
    }

    @GetMapping("/selectemp")
    public String showEmpSelectPage(Model model){
        for (Employee emp : employeeService.findAllEmp()){
            System.out.println(emp.getName() + "  " + emp.getSurname());
        }

        model.addAttribute("showEmp", employeeService.findAllEmp());

        return "emp-page";
    }

    @PostMapping("/show_mark_of_the_student")
    public String showStudentsMark() {

        return "redirect:/show_students_mark";
    }
}
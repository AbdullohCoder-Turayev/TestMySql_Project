package com.example.demo.Service;

import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.DTO.StudentsDTO;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Students;
import com.example.demo.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsServices {
    @Autowired
    StudentsRepository studentsRepository;

    public void save(Students students){
        studentsRepository.save(students);
    }

    public void clearStudents(){
        studentsRepository.deleteAll();
    }

    public void removeStudentById(int id){
        studentsRepository.deleteById(id);
    }

//    public Students showStudentById(int id){
//        Optional<Students> stud = studentsRepository.findById(id);
//
//        return stud.orElse(null);
//    }

    public List<Students> findAllStud(){
        return studentsRepository.findAll();
    }

    public Students findStudById(int id){
        Students stud = studentsRepository.findById(id);

        return stud;
    }

    public void saveDto(StudentsDTO studentsDTO){
        Students stud = new Students();

        stud.setName(studentsDTO.getName());
        stud.setSurname(studentsDTO.getSurname());
        stud.setGrade(studentsDTO.getGrade());
        stud.setMark(studentsDTO.getMark());

        studentsRepository.save(stud);
    }
}

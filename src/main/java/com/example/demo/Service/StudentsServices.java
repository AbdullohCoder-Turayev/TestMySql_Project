package com.example.demo.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

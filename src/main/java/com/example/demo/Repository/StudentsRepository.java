package com.example.demo.Repository;

import com.example.demo.Entity.Students;
import com.example.demo.Service.StudentsServices;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {
}

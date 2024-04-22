package com.example.demo.Repository;

import com.example.demo.Entity.Customers;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}

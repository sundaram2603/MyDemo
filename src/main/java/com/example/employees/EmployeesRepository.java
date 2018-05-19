package com.example.employees;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByName(String name);

    void deleteByName(String name);
}

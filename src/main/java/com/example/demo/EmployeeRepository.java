package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    // // public void test2();
    // // Optional<T> findById(ID id);

    // Optional<Employee> getTheBest();
}

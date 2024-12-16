package com.example.demo;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

  private final EmployeeRepository employeeRepository;

  public EmployeeController(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

   @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> findEmployee(@PathVariable Integer employeeId) {
        return this.employeeRepository.findById(employeeId);
    }

    @PostMapping("/employees")
    public Integer addOneEmployee(@Valid @RequestBody Employee employee) {
      System.out.println("Hello");
      return 2;
      // return this.employeeRepository.save(employee);
    }
}
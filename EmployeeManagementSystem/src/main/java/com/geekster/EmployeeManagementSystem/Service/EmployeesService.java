package com.geekster.EmployeeManagementSystem.Service;

import com.geekster.EmployeeManagementSystem.Model.Employees;
import com.geekster.EmployeeManagementSystem.Repository.IEmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    IEmployeesRepo iEmployeesRepo;

    public String createEmployees(Employees employees) {
        iEmployeesRepo.save(employees);
        return "Employed added";
    }

    public List<Employees> getAllEmployees() {
        return iEmployeesRepo.findAll();
    }

    public String updateEmployees( Employees employees) {
        iEmployeesRepo.save(employees);
  return "updated ";
    }

    public String deleteById(Long id) {
        iEmployeesRepo.deleteById(id);
        return "id deleted successfully";
    }
}

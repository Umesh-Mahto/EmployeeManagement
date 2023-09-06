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

    public ResponseEntity<String> createEmployees(Employees employees) {
        iEmployeesRepo.save(employees);
        return new ResponseEntity<>("employees added successfully", HttpStatus.CREATED);
    }

    public List<Employees> getAllEmployees() {
        return iEmployeesRepo.findAll();
    }

    public ResponseEntity<String> updateEmployees(long id, Employees employees) {
    if(iEmployeesRepo.findById(id).isPresent()){
        return new ResponseEntity<>("employees does not exits",HttpStatus.NOT_FOUND);
    }
    Employees employeesDetails=iEmployeesRepo.findById(id).get();

      if(employees.getEmail()!=null){
        employeesDetails.setEmail(employees.getEmail());
       }
        if(employees.getFirstName()!=null){
            employeesDetails.setFirstName(employees.getFirstName());
        }
        if(employees.getLastName()!=null){
            employeesDetails.setLastName(employees.getLastName());
        }
        if(employees.getJobRole()!=null){
            employeesDetails.setJobRole(employees.getJobRole());
        }
        if(employees.getSalary()!=0){
            employeesDetails.setSalary(employees.getSalary());
        }
        if(employees.getPhoneNumber()!=null){
            employeesDetails.setPhoneNumber(employees.getPhoneNumber());
        }
        iEmployeesRepo.save(employeesDetails);
        return new ResponseEntity<>("employees updated successfully",HttpStatus.OK);
    }


    public String deleteById(Long id) {
        iEmployeesRepo.deleteById(id);
        return "id deleted successfully";
    }
}

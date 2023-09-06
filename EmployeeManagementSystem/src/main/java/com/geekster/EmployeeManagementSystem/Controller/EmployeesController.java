package com.geekster.EmployeeManagementSystem.Controller;

import com.geekster.EmployeeManagementSystem.Model.Employees;
import com.geekster.EmployeeManagementSystem.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    @Autowired
    EmployeesService employeesService;
    @GetMapping("/hello")
    public String helloWord(){
        return "hello umesh";
    }
    @PostMapping("/createEmployees")
    public ResponseEntity<String>createEmployees(@RequestBody Employees employees){
        return employeesService.createEmployees(employees);
    }
   @GetMapping("/getAllEmployees")
    public List<Employees> getAllEmployees(){
        return employeesService.getAllEmployees();
   }
   @PutMapping("/updateEmployees/{id}")
    public ResponseEntity<String>updateEmployees(@PathVariable Long id,@RequestBody Employees employees){
        return employeesService.updateEmployees(id,employees);
   }
   @DeleteMapping("/deleteById/{id}")
    public  String deleteById(@PathVariable long id){
        return employeesService.deleteById(id);
   }
}

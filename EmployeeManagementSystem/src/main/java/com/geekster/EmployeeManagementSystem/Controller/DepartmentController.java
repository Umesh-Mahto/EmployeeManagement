package com.geekster.EmployeeManagementSystem.Controller;

import com.geekster.EmployeeManagementSystem.Model.Department;
import com.geekster.EmployeeManagementSystem.Model.Employees;
import com.geekster.EmployeeManagementSystem.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;


    @PostMapping("/addDepartment")
    public String addDepartment( @RequestBody Department department){
        return departmentService.addDepartment(department);
    }
    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }
    @PutMapping("/updateDepartment")
    public String updateDepartment(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }
    @DeleteMapping("/deleteById/{id}")
    public  String deleteById(@PathVariable long id){
        return departmentService.deleteById(id);
    }
}

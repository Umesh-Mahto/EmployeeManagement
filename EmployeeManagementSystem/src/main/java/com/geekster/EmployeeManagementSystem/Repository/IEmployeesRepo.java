package com.geekster.EmployeeManagementSystem.Repository;

import com.geekster.EmployeeManagementSystem.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeesRepo extends JpaRepository<Employees,Long> {
}

package com.geekster.EmployeeManagementSystem.Repository;

import com.geekster.EmployeeManagementSystem.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iDepartmentRepo extends JpaRepository<Department,Long> {
}

package com.employee.employeedemo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.employee.employeedemo.Entities.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{

    // This will be AUTO IMPLEMENTED by Spring into a Bean called employeeRepository
    // CRUD refers Create, Read, Update, Delete
    
}

package codegym.service;

import codegym.model.Department;
import codegym.model.Employee;


public interface DepartmentService {
    Iterable<Department> findAll();
    Department findById(Long id);
    void save(Department department);
    void remove(Long id);
}

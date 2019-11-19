package codegym.service;

import codegym.model.Department;
import codegym.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Long id);

    void save(Employee employee);

    void remove(Long id);
    Page<Employee> findAllByNameContraining(String name, Pageable pageable);
    Iterable<Employee> findAllByDepartment(Department department);
}

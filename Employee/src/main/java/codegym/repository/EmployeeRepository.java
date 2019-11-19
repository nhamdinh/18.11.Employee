package codegym.repository;

import codegym.model.Department;
import codegym.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    Iterable<Employee> findAllByDepartment(Department department);
    Page<Employee> findAllByNameContaining(String name, Pageable pageable);
}

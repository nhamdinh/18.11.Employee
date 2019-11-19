package codegym.repository;

import codegym.model.Department;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartmentRepository extends PagingAndSortingRepository<Department,Long> {

}

package sonnyboy.exercise.SpringBootExercise.repository;

import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee addEmployee(Employee employee) throws EmployeeNotFoundException;
    Employee deleteEmployee(Employee employee) throws EmployeeNotFoundException;
    Employee getEmployee(Employee employee) throws EmployeeNotFoundException;
    List<Employee> getEmployees();
    Employee getEmployeeForCustomerOrder(CustomerOrder customerOrder) throws EmployeeNotFoundException;
}

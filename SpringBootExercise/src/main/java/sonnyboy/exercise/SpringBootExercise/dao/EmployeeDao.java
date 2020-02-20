package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee addEmployee(Employee employee);
    Employee deleteEmployee(Employee employee);
    Employee getEmployee(Employee employee);
    List<Employee> getEmployees();
    List<Employee> getEmployeeForCustomerOrder(CustomerOrder customerOrder);
}

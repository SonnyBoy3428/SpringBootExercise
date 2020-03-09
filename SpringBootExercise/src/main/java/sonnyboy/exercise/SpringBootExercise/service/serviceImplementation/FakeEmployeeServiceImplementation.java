package sonnyboy.exercise.SpringBootExercise.service.serviceImplementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.exception.DepartmentNotFoundException;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Department;
import sonnyboy.exercise.SpringBootExercise.model.Employee;
import sonnyboy.exercise.SpringBootExercise.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * A mock implementation of a datasource for employee entities.
 * This fake implementation is nonsensical in that ids can be reused and also id gaps can occur.
 */
@Service
@Qualifier("fakeEmployeeServiceImpl")
public class FakeEmployeeServiceImplementation implements EmployeeService {
    List<Employee> employeeDb = new ArrayList<Employee>();

    @Override
    public Employee getEmployeeById(long id) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        Employee foundEmployee = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getId() == id){
                foundEmployee = employeeEntity;
                break;
            }
        }

        if(foundEmployee.equals(null)){
            throw new EmployeeNotFoundException("No employee with the id " + id + " exists.");
        }

        return foundEmployee;
    }

    @Override
    public List<Employee> getEmployeesByFirstName(String firstName) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        List<Employee> foundEmployees = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getFirstName().equals(firstName)){
                foundEmployees.add(employeeEntity);
            }
        }

        if(foundEmployees.equals(null) ||foundEmployees.isEmpty()){
            throw new EmployeeNotFoundException("No employee with the first name " + firstName + " exists.");
        }

        return foundEmployees;
    }

    @Override
    public List<Employee> getEmployeesByLastName(String lastName) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        List<Employee> foundEmployees = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getLastName().equals(lastName)){
                foundEmployees.add(employeeEntity);
            }
        }

        if(foundEmployees.equals(null) ||foundEmployees.isEmpty()){
            throw new EmployeeNotFoundException("No employee with the last name " + lastName + " exists.");
        }

        return foundEmployees;
    }

    @Override
    public List<Employee> getEmployeesByFullName(String firstName, String lastName) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        List<Employee> foundEmployees = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getFirstName().equals(firstName) && employeeEntity.getLastName().equals(lastName)){
                foundEmployees.add(employeeEntity);
            }
        }

        if(foundEmployees.equals(null) ||foundEmployees.isEmpty()){
            throw new EmployeeNotFoundException("No employee with the full name " + firstName + " " + lastName + " exists.");
        }

        return foundEmployees;
    }

    @Override
    public Employee getEmployeeByUsername(String username) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        Employee foundEmployee = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getUsername().equals(username)){
                foundEmployee = employeeEntity;
                break;
            }
        }

        if(foundEmployee.equals(null)){
            throw new EmployeeNotFoundException("No employee with the username " + username + " exists.");
        }

        return foundEmployee;
    }

    @Override
    public List<Employee> getEmployeesFromFacility(String facility) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        List<Employee> foundEmployees = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getFacility().equals(facility)){
                foundEmployees.add(employeeEntity);
            }
        }

        if(foundEmployees.equals(null) ||foundEmployees.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist at the facility " + facility + ".");
        }

        return foundEmployees;
    }

    @Override
    public List<Employee> getEmployeesWithUserRole(String userRole) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        List<Employee> foundEmployees = null;
        for(Employee employeeEntity : employeeDb){
            if(employeeEntity.getUserRole().equals(userRole)){
                foundEmployees.add(employeeEntity);
            }
        }

        if(foundEmployees.equals(null) ||foundEmployees.isEmpty()){
            throw new EmployeeNotFoundException("No employees with the user role " + userRole + " exist.");
        }

        return foundEmployees;
    }

    @Override
    public List<Employee> getAllEmployees() throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        return employeeDb;
    }

    @Override
    public Employee addEmployee(Employee employee) throws EmployeeNotFoundException {
        if(employee.equals(null)){
            throw new EmployeeNotFoundException("Cannot add an empty employee.");
        }

        if(employee.getId() <= 0){
            if(!employeeDb.isEmpty()){
                employee.setId(employeeDb.size());
            }else{
                employee.setId(1);
            }
        }
        employeeDb.add(employee);

        return employee;
    }

    @Override
    public Employee deleteEmployee(long id) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        Employee employee = getEmployeeById(id);

        if(employee.equals(null)){
            throw new EmployeeNotFoundException("Cannot delete an empty employee.");
        }

        employeeDb.remove(employee);

        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
        if(employeeDb.isEmpty()){
            throw new EmployeeNotFoundException("No employees exist.");
        }

        Employee employeeToBeUpdated = getEmployeeById(employee.getId());

        if(employee.equals(null) || employeeToBeUpdated.equals(null)){
            throw new EmployeeNotFoundException("Cannot update an empty employee.");
        }

        employeeDb.remove(employeeToBeUpdated);
        employeeDb.add(employee);

        return employee;
    }

    @Override
    public Department getDepartmentToWhichEmployeeBelongs(long id) throws EmployeeNotFoundException, DepartmentNotFoundException {
        Employee employee = getEmployeeById(id);

        Department department = employee.getDepartment();

        if(department.equals(null)){
            throw new DepartmentNotFoundException("Employee does not belong to a department yet.");
        }

        return department;
    }
}

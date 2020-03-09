package sonnyboy.exercise.SpringBootExercise.service;

import sonnyboy.exercise.SpringBootExercise.exception.DepartmentNotFoundException;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Department;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.List;

/**
 * The employee service interface.
 */
public interface EmployeeService {
    /**
     * Gets an employee by ID.
     * @param id The employee's ID.
     * @return The employee with the corresponding ID.
     * @throws EmployeeNotFoundException Is thrown when no employee can be found with the ID.
     */
    Employee getEmployeeById(long id) throws EmployeeNotFoundException;

    /**
     * Gets employees by their first name.
     * @param firstName The employee' first name.
     * @return Employees with the corresponding first name.
     * @throws EmployeeNotFoundException Is thrown when no employee can be found with the first name.
     */
    List<Employee> getEmployeesByFirstName(String firstName) throws EmployeeNotFoundException;

    /**
     * Gets employees by their last name.
     * @param lastName The employees' last name.
     * @return Employees with the corresponding last name.
     * @throws EmployeeNotFoundException Is thrown when no employee can be found with the last name.
     */
    List<Employee> getEmployeesByLastName(String lastName) throws EmployeeNotFoundException;

    /**
     * Gets employees by their full name.
     * @param firstName The employees' first name.
     * @param lastName The employees' last name.
     * @return Employees with the corresponding full name.
     * @throws EmployeeNotFoundException Is thrown when no employee can be found with the full name.
     */
    List<Employee> getEmployeesByFullName(String firstName, String lastName) throws EmployeeNotFoundException;

    /**
     * Gets a employee by username.
     * @param username The employee's username.
     * @return Employee with the corresponding username.
     * @throws EmployeeNotFoundException Is thrown when no employee can be found with the username.
     */
    Employee getEmployeeByUsername(String username) throws EmployeeNotFoundException;

    /**
     * Gets all employees form a facility.
     * @return All employees from a facility.
     * @param facility The facility from which the employees should be fetched.
     * @throws EmployeeNotFoundException Is thrown when no employees can be found from the facility.
     */
    List<Employee> getEmployeesFromFacility(String facility) throws EmployeeNotFoundException;

    /**
     * Gets all employees with a user role.
     * @return All employees with a user role.
     * @param userRole The user role which the users share
     * @throws EmployeeNotFoundException Is thrown when no employees can be found with the user role.
     */
    List<Employee> getEmployeesWithUserRole(String userRole) throws EmployeeNotFoundException;

    /**
     * Gets all employees.
     * @return All employees.
     * @throws EmployeeNotFoundException Is thrown when no employees can be found.
     */
    List<Employee> getAllEmployees() throws EmployeeNotFoundException;

    /**
     * Adds a employee to the datasource.
     * @param employee The employee that is to be added.
     * @return The added employee.
     * @throws EmployeeNotFoundException Is thrown when the passed employee is empty.
     */
    Employee addEmployee(Employee employee) throws EmployeeNotFoundException;

    /**
     * Deletes a employee from the datasource.
     * @param id The employee's ID.
     * @return The deleted employee
     * @throws EmployeeNotFoundException Is thrown when the passed employee is empty.
     */
    Employee deleteEmployee(long id) throws EmployeeNotFoundException;

    /**
     * Updates a employee in the datasource.
     * @param employee The employee that is to be updated (already including the updated fields).
     * @return The updated employee.
     * @throws EmployeeNotFoundException Is thrown when the passed employee is empty.
     */
    Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;

    /**
     * Gets the department to which an employee belongs.
     * @param id Id of the employee, whose department should be fetched.
     * @return The employee's departments.
     * @throws EmployeeNotFoundException Is thrown when the employee does not exist.
     * @throws DepartmentNotFoundException Is thrown when the department cannot be fetched.
     */
    Department getDepartmentToWhichEmployeeBelongs(long id) throws EmployeeNotFoundException, DepartmentNotFoundException;
}

package sonnyboy.exercise.SpringBootExercise.service;

import sonnyboy.exercise.SpringBootExercise.exception.DepartmentNotFoundException;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Department;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.List;

/**
 * The department service interface.
 */
public interface DepartmentService {
    /**
     * Gets a department by ID.
     * @param id ID of the department.
     * @return The department.
     * @throws DepartmentNotFoundException Is thrown when no departments can be found with the ID.
     */
    Department getDepartmentById(long id) throws DepartmentNotFoundException;

    /**
     * Gets the department by Name.
     * @param name Name of the department.
     * @return The department.
     * @throws DepartmentNotFoundException Is thrown when no departments can be found with the name.
     */
    Department getDepartmentByName(String name) throws DepartmentNotFoundException;

    /**
     * Gets all departments.
     * @return List of all departments.
     * @throws DepartmentNotFoundException Is thrown when no departments can be found.
     */
    List<Department> getAllDepartments() throws DepartmentNotFoundException;

    /**
     * Adds a departments to the datasource.
     * @param department The new department.
     * @return The newly added department.
     * @throws DepartmentNotFoundException Is thrown when the department to be added is empty.
     */
    Department addDepartment(Department department) throws DepartmentNotFoundException;

    /**
     * Deletes a department from the datasource.
     * @param id The ID of the department to be removed.
     * @return The newly removed department.
     * @throws DepartmentNotFoundException Is thrown when the department to be deleted is empty.
     */
    Department deleteDepartment(long id) throws DepartmentNotFoundException;

    /**
     * Updates a department in the datasource.
     * @param department The department to be updated.
     * @return The updated department.
     * @throws DepartmentNotFoundException Is thrown when the department to be updated is empty.
     */
    Department updateDepartment(Department department) throws DepartmentNotFoundException;

    /**
     * Gets the employees belonging to the department.
     * @param id Id of the department.
     * @return The departments's employees.
     * @throws DepartmentNotFoundException Is thrown when the department does not exist.
     * @throws EmployeeNotFoundException Is thrown when the employee cannot be fetched.
     */
    List<Employee> getEmployeesBelongingToDepartment(long id) throws DepartmentNotFoundException, EmployeeNotFoundException;
}
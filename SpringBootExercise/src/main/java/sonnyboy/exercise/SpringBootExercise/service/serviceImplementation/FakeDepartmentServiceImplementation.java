package sonnyboy.exercise.SpringBootExercise.service.serviceImplementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.exception.DepartmentNotFoundException;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Department;
import sonnyboy.exercise.SpringBootExercise.model.Employee;
import sonnyboy.exercise.SpringBootExercise.service.DepartmentService;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("fakeDepartmentServiceImpl")
public class FakeDepartmentServiceImplementation implements DepartmentService {
    List<Department> departmentDb = new ArrayList<Department>();

    @Override
    public Department getDepartmentById(long id) throws DepartmentNotFoundException {
        if(departmentDb.isEmpty()){
            throw new DepartmentNotFoundException("No departments exist.");
        }

        Department foundDepartment = null;
        for(Department departmentEntity : departmentDb){
            if(departmentEntity.getId() == id){
                foundDepartment = departmentEntity;
                break;
            }
        }

        if(foundDepartment.equals(null)){
            throw new DepartmentNotFoundException("No department with the id " + id + " exists.");
        }

        return foundDepartment;
    }

    @Override
    public Department getDepartmentByName(String name) throws DepartmentNotFoundException {
        if(departmentDb.isEmpty()){
            throw new DepartmentNotFoundException("No departments exist.");
        }

        Department foundDepartment = null;
        for(Department departmentEntity : departmentDb){
            if(departmentEntity.getName().equals(name)){
                foundDepartment = departmentEntity;
                break;
            }
        }

        if(foundDepartment.equals(null)){
            throw new DepartmentNotFoundException("No department with the name " + name + " exists.");
        }

        return foundDepartment;
    }

    @Override
    public List<Department> getAllDepartments() throws DepartmentNotFoundException {
        if(departmentDb.isEmpty()){
            throw new DepartmentNotFoundException("No departments exist.");
        }

        return departmentDb;
    }

    @Override
    public Department addDepartment(Department department) throws DepartmentNotFoundException {
        if(department.equals(null)){
            throw new DepartmentNotFoundException("Cannot add an empty department.");
        }

        if(department.getId() <= 0){
            if(!departmentDb.isEmpty()){
                department.setId(departmentDb.size());
            }else{
                department.setId(1);
            }
        }
        departmentDb.add(department);

        return department;
    }

    @Override
    public Department deleteDepartment(long id) throws DepartmentNotFoundException {
        if(departmentDb.isEmpty()){
            throw new DepartmentNotFoundException("No departments exist.");
        }

        Department department = getDepartmentById(id);

        if(department.equals(null)){
            throw new DepartmentNotFoundException("Cannot delete an empty department.");
        }

        departmentDb.remove(department);

        return department;
    }

    @Override
    public Department updateDepartment(Department department) throws DepartmentNotFoundException {
        if(departmentDb.isEmpty()){
            throw new DepartmentNotFoundException("No departments exist.");
        }

        Department departmentToBeUpdated = getDepartmentById(department.getId());

        if(department.equals(null) || departmentToBeUpdated.equals(null)){
            throw new DepartmentNotFoundException("Cannot update an empty department.");
        }

        departmentDb.remove(departmentToBeUpdated);
        departmentDb.add(department);

        return department;
    }

    @Override
    public List<Employee> getEmployeesBelongingToDepartment(long id) throws DepartmentNotFoundException, EmployeeNotFoundException {
        Department department = getDepartmentById(id);

        List<Employee> employees = department.getEmployees();

        if(employees.equals(null) || employees.isEmpty()){
            throw new EmployeeNotFoundException("Department does not have any employees yet.");
        }

        return employees;
    }
}

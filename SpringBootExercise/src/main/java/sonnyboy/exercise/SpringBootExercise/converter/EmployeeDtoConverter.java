package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.dto.EmployeeDto;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * A converter class for the conversion operations between Employee objects and EmployeeDto objects.
 */
@Component
public class EmployeeDtoConverter {
    /**
     * Converts an EmployeeDto object into an Employee object.
     * @param employeeDto The EmployeeDto object to be converted.
     * @return The Employee object.
     */
    public Employee convertEmployeeDtoToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setZipCode(employeeDto.getZipCode());
        employee.setAddress(employeeDto.getAddress());
        employee.setDateOfBirth(employeeDto.getDateOfBirth());
        employee.setUsername(employeeDto.getUsername());
        employee.setPassword(employeeDto.getPassword());
        employee.setUserRole(employeeDto.getUserRole());
        employee.setFacility(employeeDto.getFacility());

        return employee;
    }

    /**
     * Converts a Employee object into a EmployeeDto object.
     * @param employee The Employee object to be converted.
     * @return The EmployeeDto object.
     */
    public EmployeeDto convertEmployeeToEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setZipCode(employee.getZipCode());
        employeeDto.setAddress(employee.getAddress());
        employeeDto.setDateOfBirth(employee.getDateOfBirth());
        employeeDto.setUsername(employee.getUsername());
        employeeDto.setPassword(employee.getPassword());
        employeeDto.setUserRole(employee.getUserRole());
        employeeDto.setFacility(employee.getFacility());

        return employeeDto;
    }

    /**
     * Converts a list of Employee objects into a list of EmployeeDto objects.
     * @param employees The list of Employee objects to be converted.
     * @return The list of EmployeeDto objects.
     */
    public List<EmployeeDto> convertEmployeesToEmployeeDtos(List<Employee> employees){
        List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
        for(Employee employee : employees){
            EmployeeDto employeeDto = convertEmployeeToEmployeeDto(employee);
            employeeDtos.add(employeeDto);
        }

        return employeeDtos;
    }
}

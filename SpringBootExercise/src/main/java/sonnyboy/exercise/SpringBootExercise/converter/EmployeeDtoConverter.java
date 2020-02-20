package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.EmployeeDto;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

@Component
public class EmployeeDtoConverter {
    public Employee convertEmployeeDtoToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmployeeAddress(employeeDto.getEmployeeAddress());
        employee.setEmployeeZip(employeeDto.getEmployeeZip());
        employee.setEmployeeDob(employeeDto.getEmployeeDob());

        return employee;
    }
}

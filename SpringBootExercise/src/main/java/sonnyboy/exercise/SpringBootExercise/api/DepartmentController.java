package sonnyboy.exercise.SpringBootExercise.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sonnyboy.exercise.SpringBootExercise.dto.EmployeeDto;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Department;
import sonnyboy.exercise.SpringBootExercise.model.Employee;
import sonnyboy.exercise.SpringBootExercise.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping
    public EmployeeDto getEmployeeById(@RequestParam long id) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employee with ID " + id + ".");

        Employee foundEmployee = employeeService.getEmployeeById(id);

        return employeeDtoConverter.convertEmployeeToEmployeeDto(foundEmployee);
    }

    @GetMapping
    public List<EmployeeDto> getEmployeesByFirstName(@RequestParam String firstName) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employees with first name " + firstName + ".");

        List<Employee> foundEmployees = employeeService.getEmployeesByFirstName(firstName);

        return employeeDtoConverter.convertEmployeesToEmployeeDtos(foundEmployees);
    }
}

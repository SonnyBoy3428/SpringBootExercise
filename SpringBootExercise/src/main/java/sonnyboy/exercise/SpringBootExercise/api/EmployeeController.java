package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sonnyboy.exercise.SpringBootExercise.converter.EmployeeDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.EmployeeDto;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Employee;
import sonnyboy.exercise.SpringBootExercise.service.EmployeeService;

import java.util.List;

/**
 * REST Api for the customer endpoints.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;
    private final EmployeeDtoConverter employeeDtoConverter;

    @Autowired
    public EmployeeController(EmployeeService employeeService, EmployeeDtoConverter employeeDtoConverter){
        this.employeeService = employeeService;
        this.employeeDtoConverter = employeeDtoConverter;
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

    @GetMapping
    public List<EmployeeDto> getEmployeesByLastName(@RequestParam String lastName) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employees with last name " + lastName + ".");

        List<Employee> foundEmployees = employeeService.getEmployeesByLastName(lastName);

        return employeeDtoConverter.convertEmployeesToEmployeeDtos(foundEmployees);
    }

    @GetMapping
    public List<EmployeeDto> getEmployeesByFullName(@RequestParam String firstName, @RequestParam String lastName) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employees with full name " + firstName + " " + lastName + ".");

        List<Employee> foundEmployees = employeeService.getEmployeesByFullName(firstName, lastName);

        return employeeDtoConverter.convertEmployeesToEmployeeDtos(foundEmployees);
    }

    @GetMapping
    public EmployeeDto getEmployeeByUsername(@RequestParam String username) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employee with username " + username + ".");

        Employee foundEmployee = employeeService.getEmployeeByUsername(username);

        return employeeDtoConverter.convertEmployeeToEmployeeDto(foundEmployee);
    }

    @GetMapping
    public List<EmployeeDto> getEmployeesWithUserRole(@RequestParam String userRole) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employees with user role " + userRole + ".");

        List<Employee> foundEmployees = employeeService.getEmployeesWithUserRole(userRole);

        return employeeDtoConverter.convertEmployeesToEmployeeDtos(foundEmployees);
    }

    @GetMapping
    public List<EmployeeDto> getEmployeesFromFacility(@RequestParam String facility) throws EmployeeNotFoundException {
        logger.info("Received a GET request to get employees from facility " + facility + ".");

        List<Employee> foundEmployees = employeeService.getEmployeesFromFacility(facility);

        return employeeDtoConverter.convertEmployeesToEmployeeDtos(foundEmployees);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees() throws EmployeeNotFoundException {
        logger.info("Received a GET request to get all employees.");

        List<Employee> foundEmployees = employeeService.getAllEmployees();

        return employeeDtoConverter.convertEmployeesToEmployeeDtos(foundEmployees);
    }

    @PostMapping
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto) throws EmployeeNotFoundException {
        logger.info("Received a POST request to add a employee with the username " + employeeDto.getUsername());

        Employee employee = employeeDtoConverter.convertEmployeeDtoToEmployee(employeeDto);
        Employee addedEmployee = employeeService.addEmployee(employee);

        return employeeDtoConverter.convertEmployeeToEmployeeDto(addedEmployee);
    }

    @DeleteMapping
    public EmployeeDto deleteEmployee(@RequestParam long id) throws EmployeeNotFoundException {
        logger.info("Received a DELETE request to delete a employee with the id " + id);

        Employee deletedEmployee = employeeService.deleteEmployee(id);

        return employeeDtoConverter.convertEmployeeToEmployeeDto(deletedEmployee);
    }

    @PutMapping
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employeeDto) throws EmployeeNotFoundException {
        logger.info("Received a PUT request to update a employee with the id " + employeeDto.getId());

        Employee employee = employeeDtoConverter.convertEmployeeDtoToEmployee(employeeDto);
        Employee updatedEmployee = employeeService.updateEmployee(employee);

        return employeeDtoConverter.convertEmployeeToEmployeeDto(updatedEmployee);
    }
}

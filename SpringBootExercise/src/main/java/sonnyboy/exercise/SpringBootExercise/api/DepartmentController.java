package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sonnyboy.exercise.SpringBootExercise.converter.DepartmentDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.DepartmentDto;
import sonnyboy.exercise.SpringBootExercise.exception.DepartmentNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Department;
import sonnyboy.exercise.SpringBootExercise.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    private final DepartmentService departmentService;
    private final DepartmentDtoConverter departmentDtoConverter;

    @Autowired
    public DepartmentController(DepartmentService departmentService, DepartmentDtoConverter departmentDtoConverter){
        this.departmentService = departmentService;
        this.departmentDtoConverter = departmentDtoConverter;
    }

    @GetMapping
    public DepartmentDto getDepartmentById(@RequestParam long id) throws DepartmentNotFoundException {
        logger.info("Received a GET request to get department with ID " + id + ".");

        Department foundDepartment = departmentService.getDepartmentById(id);

        return departmentDtoConverter.convertDepartmentToDepartmentDto(foundDepartment);
    }

    @GetMapping
    public DepartmentDto getDepartmentByName(@RequestParam String name) throws DepartmentNotFoundException {
        logger.info("Received a GET request to get department with name " + name + ".");

        Department foundDepartment = departmentService.getDepartmentByName(name);

        return departmentDtoConverter.convertDepartmentToDepartmentDto(foundDepartment);
    }

    @GetMapping
    public List<DepartmentDto> getAllDepartments() throws DepartmentNotFoundException {
        logger.info("Received a GET request to get all departments.");

        List<Department> foundDepartments = departmentService.getAllDepartments();

        return departmentDtoConverter.convertDepartmentsToDepartmentDtos(foundDepartments);
    }

    @PostMapping
    public DepartmentDto addDepartments(@RequestBody DepartmentDto departmentDto) throws DepartmentNotFoundException {
        logger.info("Received a POST request to add a new department with the name " + departmentDto.getName() + ".");

        Department department = departmentDtoConverter.convertDepartmentDtoToDepartment(departmentDto);

        Department addedDepartment = departmentService.addDepartment(department);

        return departmentDtoConverter.convertDepartmentToDepartmentDto(addedDepartment);
    }

    @DeleteMapping
    public DepartmentDto deleteDepartment(@RequestParam long id) throws DepartmentNotFoundException {
        logger.info("Received a DELETE request to delete the department with the ID " + id + ".");

        Department deletedDepartment = departmentService.deleteDepartment(id);

        return departmentDtoConverter.convertDepartmentToDepartmentDto(deletedDepartment);
    }

    @PutMapping
    public DepartmentDto updatedDepartment(@RequestBody DepartmentDto departmentDto) throws DepartmentNotFoundException {
        logger.info("Received a PUT request to get update the department with the ID " + departmentDto.getId() + ".");

        Department department = departmentDtoConverter.convertDepartmentDtoToDepartment(departmentDto);

        Department updatedDepartment = departmentService.updateDepartment(department);

        return departmentDtoConverter.convertDepartmentToDepartmentDto(updatedDepartment);
    }
}

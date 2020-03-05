package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.DepartmentDto;
import sonnyboy.exercise.SpringBootExercise.model.Department;

import java.util.ArrayList;
import java.util.List;

/**
 * A converter class for the conversion operations between Department objects and DepartmentDto objects.
 */
@Component
public class DepartmentDtoConverter {
    /**
     * Converts a DepartmentDto object into a Department object.
     * @param departmentDto The DepartmentDto object to be converted.
     * @return The Department object.
     */
    public Department convertDepartmentDtoToDepartment(DepartmentDto departmentDto){
        Department department = new Department();
        department.setId(departmentDto.getId());
        department.setName(departmentDto.getName());
        department.setDescription(departmentDto.getDescription());

        return department;
    }

    /**
     * Converts a Department object into a DepartmentrDto object.
     * @param department The Department object to be converted.
     * @return The DepartmentDto object.
     */
    public DepartmentDto convertDepartmentToDepartmentDto(Department department){
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setName(department.getName());
        departmentDto.setDescription(department.getDescription());

        return departmentDto;
    }

    /**
     * Converts a list of Department objects into a list of DepartmentDto objects.
     * @param departments The list of Department objects to be converted.
     * @return The list of DepartmentDto objects.
     */
    public List<DepartmentDto> convertDepartmentsToDepartmentDtos(List<Department> departments){
        List<DepartmentDto> departmentDtos = new ArrayList<DepartmentDto>();
        for(Department department : departments){
            DepartmentDto departmentDto = convertDepartmentToDepartmentDto(department);
            departmentDtos.add(departmentDto);
        }

        return departmentDtos;
    }
}

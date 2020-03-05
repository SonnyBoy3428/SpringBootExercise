package sonnyboy.exercise.SpringBootExercise.dto;

import sonnyboy.exercise.SpringBootExercise.model.Employee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * The data transfer object for department entities.
 */
public class DepartmentDto {
    private long id;
    private String name;
    private String description;

    private List<Employee> employees;

    public DepartmentDto(){

    }

    /**
     * GETTERS
     */

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    /**
     * SETTERS
     */

    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }
}

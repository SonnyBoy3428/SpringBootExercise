package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.util.List;

/**
 * Department entity for the datasource.
 */
@Entity
public class Department {
    private long id;
    private String name;
    private String description;

    private List<Employee> employees;

    public Department(){

    }

    /**
     * GETTERS
     */

    @Column(name="Id")
    @Id
    @GeneratedValue
    public long getId(){
        return this.id;
    }

    @Column(name="Name")
    public String getName(){
        return this.name;
    }

    @Column(name="Description")
    public String getDescription(){
        return this.description;
    }

    @OneToMany
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

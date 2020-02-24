package sonnyboy.exercise.SpringBootExercise.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Department;

import java.sql.Date;
import java.util.List;

/**
 * The data transfer object for employee entities.
 */
public class EmployeeDto {
    private long id;
    private String firstName;
    private String lastName;
    private long zipCode;
    private String address;
    private Date dateOfBirth;
    private String username;
    private String password;
    private String userRole;
    private String facility;

    private Department department;
    private List<CustomerOrder> customerOrders;

    public EmployeeDto(){

    }

    /**
     * GETTERS
     */

    public long getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public long getZipCode(){
        return this.zipCode;
    }

    public String getAddress(){
        return this.address;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getUserRole(){
        return this.userRole;
    }

    public String getFacility(){
        return this.facility;
    }

    public Department getDepartment(){
        return this.department;
    }

    public List<CustomerOrder> getCustomerOrders(){
        return this.customerOrders;
    }

    /**
     * SETTERS
     */

    public void setId(long id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setZipCode(long zipCode){
        this.zipCode = zipCode;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setUserRole(String userRole){
        this.userRole = userRole;
    }

    public void setFacility(String facility){
        this.facility = facility;
    }

    public void setDepartment(Department department){this.department = department;}

    public void setCustomerOrders(List<CustomerOrder> customerOrders){
        this.customerOrders = customerOrders;
    }
}

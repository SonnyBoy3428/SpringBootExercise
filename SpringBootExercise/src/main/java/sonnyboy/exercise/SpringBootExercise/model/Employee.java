package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Employee entity for the datasource.
 */
@Entity(name="Employee")
public class Employee {
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

    public Employee(){

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

    @Column(name="FirstName")
    public String getFirstName(){
        return this.firstName;
    }

    @Column(name="LastName")
    public String getLastName(){
        return this.lastName;
    }

    @Column(name="ZipCode")
    public long getZipCode(){
        return this.zipCode;
    }

    @Column(name="Address")
    public String getAddress(){
        return this.address;
    }

    @Column(name="DateOfBirth")
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    @Column(name="Username")
    public String getUsername(){
        return this.username;
    }

    @Column(name="Password")
    public String getPassword(){
        return this.password;
    }

    @Column(name="UserRole")
    public String getUserRole(){
        return this.userRole;
    }

    @Column(name="Facility")
    public String getFacility(){
        return this.facility;
    }

    @ManyToOne
    public Department getDepartment(){
        return this.department;
    }

    @OneToMany
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

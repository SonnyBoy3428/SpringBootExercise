package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Customer entity for the datasource.
 */
@Entity(name="Customer")
public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private long zipCode;
    private String address;
    private Date dateOfBirth;
    private String username;
    private String password;
    private boolean isPrimeCustomer;

    private List<CustomerOrder> customerOrders;

    public Customer(){

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

    @Column(name="FirstName", nullable=false)
    public String getFirstName(){
        return this.firstName;
    }

    @Column(name="LastName", nullable=false)
    public String getLastName(){
        return this.lastName;
    }

    @Column(name="ZipCode", nullable=false)
    public long getZipCode(){
        return this.zipCode;
    }

    @Column(name="Address", nullable=false)
    public String getAddress(){
        return this.address;
    }

    @Column(name="DateOfBirth", nullable=false)
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    @Column(name="Username", nullable=false)
    public String getUsername(){
        return this.username;
    }

    @Column(name="Password", nullable=false)
    public String getPassword(){
        return this.password;
    }

    @Column(name="IsPrimeCustomer", nullable=false)
    public boolean getIsPrimeCustomer(){
        return this.isPrimeCustomer;
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

    public void setIsPrimeCustomer(boolean isPrimeCustomer){
        this.isPrimeCustomer = isPrimeCustomer;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders){
        this.customerOrders = customerOrders;
    }
}

package sonnyboy.exercise.SpringBootExercise.dto;

import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.sql.Date;
import java.util.List;

/**
 * The data transfer object for customer entities.
 */
public class CustomerDto {
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

    public CustomerDto(){

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

    public boolean getIsPrimeCustomer(){
        return this.isPrimeCustomer;
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

    public void setIsPrimeCustomer(boolean isPrimeCustomer){
        this.isPrimeCustomer = isPrimeCustomer;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders){
        this.customerOrders = customerOrders;
    }
}

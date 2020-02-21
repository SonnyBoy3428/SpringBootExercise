package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Customer entity for the database.
 */
@Entity(name="Customer")
public class Customer {
    private long customerId;
    private String customerName;
    private long customerZip;
    private String customerAddress;
    private Date customerDob;
    private List<CustomerOrder> customerOrders;

    public Customer(){

    }

    /**
     * GETTERS
     */

    @Column(name="CustomerId")
    @Id
    @GeneratedValue
    public long getCustomerId(){
        return this.customerId;
    }

    @Column(name="CustomerName")
    public String getCustomerName(){
        return this.customerName;
    }

    @Column(name="CustomerZip")
    public long getCustomerZip(){
        return this.customerZip;
    }

    @Column(name="CustomerAddress")
    public String getCustomerAddress(){
        return this.customerAddress;
    }

    @Column(name="CustomerDob")
    public Date getCustomerDob(){
        return this.customerDob;
    }

    @OneToMany
    public List<CustomerOrder> getCustomerOrders(){
        return this.customerOrders;
    }

    /**
     * SETTERS
     */

    public void setCustomerId(long customerId){
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerZip(long customerZip){
        this.customerZip = customerZip;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

    public void setCustomerDob(Date customerDob){
        this.customerDob = customerDob;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders){
        this.customerOrders = customerOrders;
    }
}

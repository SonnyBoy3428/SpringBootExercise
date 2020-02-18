package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Customer {
    private long customerId;
    private String customerName;
    private long customerZip;
    private String customerAddress;
    private Date customerDob;
    private Set<Order> placedOrders;

    public Customer(){

    }

    @Column
    @Id
    @GeneratedValue
    public long getCustomerId(){
        return this.customerId;
    }

    @Column
    public String getCustomerName(){
        return this.customerName;
    }

    @Column
    public long getCustomerZip(){
        return this.customerZip;
    }

    @Column
    public String getCustomerAddress(){
        return this.customerAddress;
    }

    @Column
    public Date getCustomerDob(){
        return this.customerDob;
    }

    @OneToMany
    public Set<Order> getPlacedOrders(){
        return this.placedOrders;
    }

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

    public void setPlacedOrders(Set<Order> placedOrders){
        this.placedOrders = placedOrders;
    }

    @Override
    public String toString(){
        return "{" +
                "'customerId':" + getCustomerId() + "," +
                "'customerName':'" + getCustomerName() + "'," +
                "'customerZip':" + getCustomerZip() + "," +
                "'customerAddress':'" + getCustomerAddress() + "'," +
                "'customerDob':" + getCustomerDob()
                + "}";
    }
}

package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity(name="CustomerOrder")
public class CustomerOrder {
    private long customerOrderId;
    private double customerOrderCost;
    private Date customerOrderDate;
    private Employee employee;
    private Customer customer;
    private List<CustomerOrderItem> customerOrderItems;

    public CustomerOrder(){

    }

    @Column(name="CustomerOrderId")
    @Id
    @GeneratedValue
    public long getCustomerOrderId(){
        return this.customerOrderId;
    }

    @Column(name="CustomerOrderCost")
    public double getCustomerOrderCost(){
        return this.customerOrderCost;
    }

    @Column(name="CustomerOrderDate")
    public Date getCustomerOrderDate(){
        return this.customerOrderDate;
    }

    @ManyToOne
    public Employee getEmployee(){
        return this.employee;
    }

    @ManyToOne
    public Customer getCustomer(){
        return this.customer;
    }

    @OneToMany(mappedBy = "customerOrder")
    public List<CustomerOrderItem> getCustomerOrderItems(){
        return this.customerOrderItems;
    }

    public void setCustomerOrderId(long customerOrderId){
        this.customerOrderId = customerOrderId;
    }

    public void setCustomerOrderCost(double customerOrderCost){
        this.customerOrderCost = customerOrderCost;
    }

    public void setCustomerOrderDate(Date customerOrderDate){
        this.customerOrderDate = customerOrderDate;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setCustomerOrderItems(List<CustomerOrderItem> customerOrderItems){
        this.customerOrderItems = customerOrderItems;
    }
}

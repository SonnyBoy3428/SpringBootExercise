package sonnyboy.exercise.SpringBootExercise.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrderItem;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.sql.Date;
import java.util.List;

public class CustomerOrderDto {
    private long customerOrderId;
    private double customerOrderCost;
    private Date customerOrderDate;
    private Employee employee;
    private Customer customer;
    private List<CustomerOrderItem> customerOrderItems;

    public CustomerOrderDto(@JsonProperty("customerOrderCost") double customerOrderCost,
                    @JsonProperty("customerOrderDate") Date customerOrderDate){
        this.customerOrderCost = customerOrderCost;
        this.customerOrderDate = customerOrderDate;
    }

    public long getCustomerOrderId(){
        return this.customerOrderId;
    }

    public double getCustomerOrderCost(){
        return this.customerOrderCost;
    }

    public Date getCustomerOrderDate(){
        return this.customerOrderDate;
    }

    public Employee getEmployee(){
        return this.employee;
    }

    public Customer getCustomer(){
        return this.customer;
    }

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

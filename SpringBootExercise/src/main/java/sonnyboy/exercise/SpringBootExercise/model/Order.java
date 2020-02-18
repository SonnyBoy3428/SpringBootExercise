package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Order {
    private long orderId;
    private double orderCost;
    private Date orderDate;
    private Employee supervisingEmployee;
    private Customer orderingCustomer;
    private Set<Item> orderItems;

    public Order(){

    }

    @Column
    @Id
    @GeneratedValue
    public long getOrderId(){
        return this.orderId;
    }

    @Column
    public double getOrderCost(){
        return this.orderCost;
    }

    @Column
    public Date getOrderDate(){
        return this.orderDate;
    }

    @ManyToOne
    public Employee getSupervisingEmployee(){
        return this.supervisingEmployee;
    }

    @ManyToOne
    public Customer getOrderingCustomer(){
        return this.orderingCustomer;
    }

    @OneToMany(mappedBy = "order")
    public Set<Item> getOrderItems(){
        return this.orderItems;
    }

    public void setOrderId(long orderId){
        this.orderId = orderId;
    }

    public void setOrderCost(double orderCost){
        this.orderCost = orderCost;
    }

    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }

    public void setSupervisingEmployee(Employee supervisingEmployee){
        this.supervisingEmployee = supervisingEmployee;
    }

    public void setOrderingCustomer(Customer orderingCustomer){
        this.orderingCustomer = orderingCustomer;
    }

    public void setOrderItems(Set<Item> orderItems){
        this.orderItems = orderItems;
    }

    @Override
    public String toString(){
        return "{" +
                "'orderId':" + getOrderId() + "," +
                "'orderCost':'" + getOrderCost() + "'," +
                "'orderDate':" + getOrderDate()
                + "}";
    }
}

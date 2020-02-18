package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Order {
    private long orderId;
    private double orderCost;
    private Date orderDate;

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

    public void setOrderId(long orderId){
        this.orderId = orderId;
    }

    public void setOrderCost(double orderCost){
        this.orderCost = orderCost;
    }

    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
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

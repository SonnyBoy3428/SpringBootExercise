package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.util.List;

@Entity(name="Item")
public class Item {
    private long itemId;
    private double itemPrice;
    private String itemName;
    private List<CustomerOrderItem> customerOrderItems;

    public Item(){

    }

    @Column(name="ItemId")
    @Id
    @GeneratedValue
    public long getItemId(){
        return this.itemId;
    }

    @Column(name="ItemPrice")
    public double getItemPrice(){
        return this.itemPrice;
    }

    @Column(name="ItemName")
    public String getItemName(){
        return this.itemName;
    }

    @OneToMany(mappedBy = "item")
    public List<CustomerOrderItem> getCustomerOrderItems(){
        return this.customerOrderItems;
    }

    public void setItemId(long itemId){
        this.itemId = itemId;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setCustomerOrderItems(List<CustomerOrderItem> customerOrderItems){
        this.customerOrderItems = customerOrderItems;
    }
}

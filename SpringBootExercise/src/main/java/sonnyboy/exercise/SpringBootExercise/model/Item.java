package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {
    private long itemId;
    private double itemPrice;
    private String itemName;
    private Set<Order> relatedOrders;

    public Item(){

    }

    @Column
    @Id
    @GeneratedValue
    public long getItemId(){
        return this.itemId;
    }

    @Column
    public double getItemPrice(){
        return this.itemPrice;
    }

    @Column
    public String getItemName(){
        return this.itemName;
    }

    @OneToMany(mappedBy = "item")
    public Set<Order> getRelatedOrders(){
        return this.relatedOrders;
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

    public void setRelatedOrders(Set<Order> relatedOrders){
        this.relatedOrders = relatedOrders;
    }

    @Override
    public String toString(){
        return "{" +
                "'itemId':" + getItemId() + "," +
                "'itemPrice':'" + getItemPrice() + "'," +
                "'itemName':" + getItemName()
                + "}";
    }
}

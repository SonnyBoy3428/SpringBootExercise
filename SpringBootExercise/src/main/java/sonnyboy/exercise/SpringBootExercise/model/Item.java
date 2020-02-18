package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    private long itemId;
    private double itemPrice;
    private String itemName;

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

    public void setItemId(long itemId){
        this.itemId = itemId;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
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

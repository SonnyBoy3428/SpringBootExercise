package sonnyboy.exercise.SpringBootExercise.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrderItem;

import java.util.List;

public class ItemDto {
    private long itemId;
    private double itemPrice;
    private String itemName;
    private List<CustomerOrderItem> customerOrderItems;

    public ItemDto(@JsonProperty("itemPrice") double itemPrice,
                    @JsonProperty("itemName") String itemName){
        this.itemPrice = itemPrice;
        this.itemName = itemName;
    }

    public long getItemId(){
        return this.itemId;
    }

    public double getItemPrice(){
        return this.itemPrice;
    }

    public String getItemName(){
        return this.itemName;
    }

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

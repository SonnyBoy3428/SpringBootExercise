package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;

@Entity
public class OrderContainsItem {
    private OrderContainsItemKey orderItemId;
    private Order order;
    private Item item;
    private long itemAmount;
    private double itemPriceSum;

    @EmbeddedId
    public OrderContainsItemKey getOrderItemId(){
        return this.orderItemId;
    }

    @ManyToOne
    @MapsId("orderId")
    public Order getOrder(){
        return this.order;
    }

    @ManyToOne
    @MapsId("itemId")
    public Item getItem(){
        return this.item;
    }

    public long getItemAmount(){
        return this.itemAmount;
    }

    public double getItemPriceSum(){
        return this.itemPriceSum;
    }

    public void setOrderItemId(OrderContainsItemKey orderItemId){
        this.orderItemId = orderItemId;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public void setItemAmount(long itemAmount){
        this.itemAmount = itemAmount;
    }

    public void setItemPriceSum(double itemPriceSum){
        this.itemPriceSum = itemPriceSum;
    }
}

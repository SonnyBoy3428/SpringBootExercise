package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name="CustomerOrderItem")
public class CustomerOrderItem implements Serializable {
    private CustomerOrder customerOrder;
    private Item item;
    private long itemAmount;
    private double itemPriceSum;

    public CustomerOrderItem(){

    }

    @Id
    @ManyToOne
    @JoinColumn
    public CustomerOrder getCustomerOrder(){
        return this.customerOrder;
    }

    @Id
    @ManyToOne
    @JoinColumn
    public Item getItem(){
        return this.item;
    }

    public long getItemAmount(){
        return this.itemAmount;
    }

    public double getItemPriceSum(){
        return this.itemPriceSum;
    }

    public void setCustomerOrder(CustomerOrder customerOrder){
        this.customerOrder = customerOrder;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomerOrderItem customerOrderItem = (CustomerOrderItem) o;
        return getItemAmount() == customerOrderItem.getItemAmount() &&
                Double.compare(customerOrderItem.getItemPriceSum(), getItemPriceSum()) == 0 &&
                getCustomerOrder().equals(customerOrderItem.getCustomerOrder()) &&
                getItem().equals(customerOrderItem.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerOrder(), getItem(), getItemAmount(), getItemPriceSum());
    }
}

package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderContainsItemKey implements Serializable {
    private long orderId;
    private long itemId;


    public OrderContainsItemKey(){

    }

    @Column(name="orderId")
    public long getOrderId(){
        return this.orderId;
    }

    @Column(name="itemId")
    public long getItemId(){
        return this.itemId;
    }

    public void setOrderId(long orderId){
        this.orderId = orderId;
    }

    public void setItemId(long itemId){
        this.itemId = itemId;
    }
}

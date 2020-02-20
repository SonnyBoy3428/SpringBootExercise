package sonnyboy.exercise.SpringBootExercise.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.sql.Date;
import java.util.List;

public class CustomerDto {
    private long customerId;
    private String customerName;
    private long customerZip;
    private String customerAddress;
    private Date customerDob;
    private List<CustomerOrder> customerOrders;

    public CustomerDto(@JsonProperty("customerName") String customerName,
                    @JsonProperty("customerZip") long customerZip,
                    @JsonProperty("customerAddress") String customerAddress,
                    @JsonProperty("customerDob") Date customerDob){
        this.customerName = customerName;
        this.customerZip = customerZip;
        this.customerAddress = customerAddress;
        this.customerDob = customerDob;
    }

    public long getCustomerId(){
        return this.customerId;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public long getCustomerZip(){
        return this.customerZip;
    }

    public String getCustomerAddress(){
        return this.customerAddress;
    }

    public Date getCustomerDob(){
        return this.customerDob;
    }

    public List<CustomerOrder> getCustomerOrders(){
        return this.customerOrders;
    }

    public void setCustomerId(long customerId){
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerZip(long customerZip){
        this.customerZip = customerZip;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

    public void setCustomerDob(Date customerDob){
        this.customerDob = customerDob;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders){
        this.customerOrders = customerOrders;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerZip=" + customerZip +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerDob=" + customerDob +
                ", customerOrders=" + customerOrders +
                '}';
    }
}

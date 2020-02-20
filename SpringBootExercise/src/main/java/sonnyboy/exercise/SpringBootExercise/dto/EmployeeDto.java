package sonnyboy.exercise.SpringBootExercise.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.sql.Date;
import java.util.List;

public class EmployeeDto {
    private long employeeId;
    private String employeeName;
    private long employeeZip;
    private String employeeAddress;
    private Date employeeDob;
    private List<CustomerOrder> customerOrders;

    public EmployeeDto(@JsonProperty("employeeName") String employeeName,
                    @JsonProperty("employeeZip") long employeeZip,
                    @JsonProperty("employeeAddress") String employeeAddress,
                    @JsonProperty("employeeDob") Date employeeDob){
        this.employeeName = employeeName;
        this.employeeZip = employeeZip;
        this.employeeAddress = employeeAddress;
        this.employeeDob = employeeDob;
    }

    public long getEmployeeId(){
        return this.employeeId;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public long getEmployeeZip(){
        return this.employeeZip;
    }

    public String getEmployeeAddress(){
        return this.employeeAddress;
    }

    public Date getEmployeeDob(){
        return this.employeeDob;
    }

    public List<CustomerOrder> getCustomerOrders(){
        return this.customerOrders;
    }

    public void setEmployeeId(long employeeId){
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmployeeZip(long employeeZip){
        this.employeeZip = employeeZip;
    }

    public void setEmployeeAddress(String employeeAddress){
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeDob(Date employeeDob){
        this.employeeDob = employeeDob;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders){
        this.customerOrders = customerOrders;
    }
}

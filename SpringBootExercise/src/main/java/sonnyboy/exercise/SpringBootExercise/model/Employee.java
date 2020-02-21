package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Employee entity for the database.
 */
@Entity(name="Employee")
public class Employee {
    private long employeeId;
    private String employeeName;
    private long employeeZip;
    private String employeeAddress;
    private Date employeeDob;
    private List<CustomerOrder> customerOrders;

    public Employee(){

    }

    /**
     * GETTERS
     */

    @Column(name="EmployeeId")
    @Id
    @GeneratedValue
    public long getEmployeeId(){
        return this.employeeId;
    }

    @Column(name="EmployeeName")
    public String getEmployeeName(){
        return this.employeeName;
    }

    @Column(name="EmployeeZip")
    public long getEmployeeZip(){
        return this.employeeZip;
    }

    @Column(name="EmployeeAddress")
    public String getEmployeeAddress(){
        return this.employeeAddress;
    }

    @Column(name="EmployeeDob")
    public Date getEmployeeDob(){
        return this.employeeDob;
    }

    @OneToMany
    public List<CustomerOrder> getCustomerOrders(){
        return this.customerOrders;
    }

    /**
     * SETTERS
     */

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

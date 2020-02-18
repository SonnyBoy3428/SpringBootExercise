package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Employee {
    private long employeeId;
    private String employeeName;
    private long employeeZip;
    private String employeeAddress;
    private Date employeeDob;
    private Set<Order> supervisedOrders;

    public Employee(){

    }

    @Column
    @Id
    @GeneratedValue
    public long getEmployeeId(){
        return this.employeeId;
    }

    @Column
    public String getEmployeeName(){
        return this.employeeName;
    }

    @Column
    public long getEmployeeZip(){
        return this.employeeZip;
    }

    @Column
    public String getEmployeeAddress(){
        return this.employeeAddress;
    }

    @Column
    public Date getEmployeeDob(){
        return this.employeeDob;
    }

    @OneToMany
    public Set<Order> getSupervisedOrders(){
        return this.supervisedOrders;
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

    public void setSupervisedOrders(Set<Order> supervisedOrders){
        this.supervisedOrders = supervisedOrders;
    }

    @Override
    public String toString(){
        return "{" +
                "'employeeId':" + getEmployeeId() + "," +
                "'employeeName':'" + getEmployeeName() + "'," +
                "'employeeZip':" + getEmployeeZip() + "," +
                "'employeeAddress':'" + getEmployeeAddress() + "'," +
                "'employeeDob':" + getEmployeeDob()
                + "}";
    }
}

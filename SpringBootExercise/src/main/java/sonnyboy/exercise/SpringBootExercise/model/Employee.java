package sonnyboy.exercise.SpringBootExercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Employee {
    private long employeeId;
    private String employeeName;
    private long employeeZip;
    private String employeeAddress;
    private Date employeeDob;

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

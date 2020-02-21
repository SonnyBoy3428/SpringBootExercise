package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.EmployeeDao;
import sonnyboy.exercise.SpringBootExercise.exception.EmployeeNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeEmployee")
public class FakeEmployeeDataAccessService implements EmployeeDao {
    private List<Employee> employeeDb = new ArrayList<Employee>();

    @Override
    public Employee addEmployee(Employee employee) throws EmployeeNotFoundException{
        if(employee.equals(null)){
            throw new EmployeeNotFoundException("Cannot add an empty employee");
        }

        employeeDb.add(employee);

        return employee;
    }

    @Override
    public Employee deleteEmployee(Employee employee) throws EmployeeNotFoundException{
        if(employee.equals(null)){
            throw new EmployeeNotFoundException("Cannot delete an empty employee");
        }

        return employee;
    }

    @Override
    public Employee getEmployee(Employee employee) throws EmployeeNotFoundException{
        Employee foundEmployee = null;

        for(Employee employeeItem : employeeDb){
            if(employeeItem.getEmployeeId() == employee.getEmployeeId()){
                foundEmployee = employeeItem;
                break;
            }
        }

        if(foundEmployee.equals(null)){
            throw new EmployeeNotFoundException("Cannot delete an emplty employee");
        }
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDb;
    }

    @Override
    public Employee getEmployeeForCustomerOrder(CustomerOrder customerOrder) throws EmployeeNotFoundException{
        if(customerOrder.getEmployee().equals(null)){
            throw new EmployeeNotFoundException("Customer order with the ID " + customerOrder.getCustomerOrderId() + " does not have an employee.");
        }

        return null;
    }
}

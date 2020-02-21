package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerOrderDao;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerOrderNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.*;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeCustomerOrder")
public class FakeCustomerOrderDataAccessService implements CustomerOrderDao {
    List<CustomerOrder> customerOrderDb = new ArrayList<CustomerOrder>();

    @Override
    public CustomerOrder addCustomerOrder(CustomerOrder customerOrder) throws CustomerOrderNotFoundException {
        if(customerOrder.equals(null)){
            throw new CustomerOrderNotFoundException("Cannot add empty customer order");
        }

        customerOrderDb.add(customerOrder);

        return customerOrder;
    }

    @Override
    public CustomerOrder deleteCustomerOrder(CustomerOrder customerOrder) throws CustomerOrderNotFoundException{
        if(customerOrder.equals(null)){
            throw new CustomerOrderNotFoundException("Cannot delete empty customer order");
        }

        customerOrderDb.remove(customerOrder);

        return customerOrder;    }

    @Override
    public CustomerOrder getCustomerOrder(CustomerOrder customerOrder) throws CustomerOrderNotFoundException{
        CustomerOrder foundCustomerOrder = null;

        for(CustomerOrder customerOrderItem : customerOrderDb){
            if(customerOrderItem.getCustomerOrderId() == customerOrder.getCustomerOrderId()){
                foundCustomerOrder = customerOrderItem;
                break;
            }
        }

        if(foundCustomerOrder.equals(null)){
            throw new CustomerOrderNotFoundException("Customer order with the ID " + customerOrder.getCustomerOrderId() + " does not exist.");
        }

        return null;
    }

    @Override
    public List<CustomerOrder> getCustomerOrders() {
        return customerOrderDb;
    }

    @Override
    public List<CustomerOrder> getCustomerOrdersForCustomer(Customer customer) throws CustomerOrderNotFoundException{
        List<CustomerOrder> customerOrders = customer.getCustomerOrders();
        if(customerOrders.equals(null) || customerOrders.isEmpty()){
            throw new CustomerOrderNotFoundException("Customer with the ID " + customer.getCustomerId() + " does not have any customer orders.");
        }

        return customerOrders;
    }

    @Override
    public List<CustomerOrder> getCustomerOrdersForEmployee(Employee employee) throws CustomerOrderNotFoundException{
        List<CustomerOrder> customerOrders = employee.getCustomerOrders();
        if(customerOrders.equals(null) || customerOrders.isEmpty()){
            throw new CustomerOrderNotFoundException("Employee with the ID " + employee.getEmployeeId() + " does not have any customer orders.");
        }

        return customerOrders;
    }

    @Override
    public List<CustomerOrder> getCustomerOrdersForItem(Item item) throws CustomerOrderNotFoundException{
        List<CustomerOrderItem> customerOrderItems = item.getCustomerOrderItems();
        List<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();

        for(CustomerOrderItem customerOrderItem : customerOrderItems){
            CustomerOrder customerOrder = customerOrderItem.getCustomerOrder();
            if(!customerOrder.equals(null)){
                customerOrders.add(customerOrderItem.getCustomerOrder());
            }
        }

        if(customerOrders.equals(null) || customerOrders.isEmpty()){
            throw new CustomerOrderNotFoundException("Item with the ID " + item.getItemId() + " does not have any customer orders.");
        }

        return customerOrders;
    }
}

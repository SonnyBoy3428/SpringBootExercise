package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Employee;
import sonnyboy.exercise.SpringBootExercise.model.Item;

import java.util.List;

public interface CustomerOrderDao {
    CustomerOrder addCustomerOrder(CustomerOrder customerOrder);
    CustomerOrder deleteCustomerOrder(CustomerOrder customerOrder);
    CustomerOrder getCustomerOrder(CustomerOrder customerOrder);
    List<CustomerOrder> getCustomerOrders();
    List<CustomerOrder> getCustomerOrdersForCustomer(Customer customer);
    List<CustomerOrder> getCustomerOrdersForEmployee(Employee employee);
    List<CustomerOrder> getCustomerOrdersForItem(Item item);
}
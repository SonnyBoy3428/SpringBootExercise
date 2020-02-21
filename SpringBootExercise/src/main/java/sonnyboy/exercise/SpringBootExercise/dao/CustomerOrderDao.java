package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.exception.CustomerOrderNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Employee;
import sonnyboy.exercise.SpringBootExercise.model.Item;

import java.util.List;

public interface CustomerOrderDao {
    CustomerOrder addCustomerOrder(CustomerOrder customerOrder) throws CustomerOrderNotFoundException;
    CustomerOrder deleteCustomerOrder(CustomerOrder customerOrder) throws CustomerOrderNotFoundException;
    CustomerOrder getCustomerOrder(CustomerOrder customerOrder) throws CustomerOrderNotFoundException;
    List<CustomerOrder> getCustomerOrders();
    List<CustomerOrder> getCustomerOrdersForCustomer(Customer customer) throws CustomerOrderNotFoundException;
    List<CustomerOrder> getCustomerOrdersForEmployee(Employee employee) throws CustomerOrderNotFoundException;
    List<CustomerOrder> getCustomerOrdersForItem(Item item) throws CustomerOrderNotFoundException;
}
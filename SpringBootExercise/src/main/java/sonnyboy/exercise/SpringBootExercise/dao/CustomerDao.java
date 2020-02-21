package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.List;

public interface CustomerDao {
    Customer addCustomer(Customer customer) throws CustomerNotFoundException;
    Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
    Customer getCustomer(Customer customer) throws CustomerNotFoundException;
    List<Customer> getCustomers();
    Customer getCustomerForCustomerOrder(CustomerOrder customerOrder) throws CustomerNotFoundException;

}

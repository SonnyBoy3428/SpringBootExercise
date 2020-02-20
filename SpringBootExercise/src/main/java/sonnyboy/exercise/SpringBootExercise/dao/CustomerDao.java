package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.List;

public interface CustomerDao {
    Customer addCustomer(Customer customer);
    Customer deleteCustomer(Customer customer);
    Customer getCustomer(Customer customer);
    List<Customer> getCustomers();
    List<Customer> getCustomerForCustomerOrder(CustomerOrder customerOrder);

}

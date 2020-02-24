package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.List;

/**
 * Customer DAO interface to specify possible repository
 */
public interface CustomerDao {
    /**
     * Adds a customer to the data source.
     *
     * @param customer The customer that is to be added.
     * @return The added customer.
     * @throws CustomerNotFoundException Is thrown in case the customer is empty.
     */
    Customer addCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Deletes a customer from the data source.
     *
     * @param customer The customer to be deleted.
     * @return The deleted customer.
     * @throws CustomerNotFoundException Is thrown in case the customer is empty.
     */
    Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Gets a specific customer.
     *
     * @param customer The customer to which the datasource object shall be fetched.
     * @return The fetched customer.
     * @throws CustomerNotFoundException Is thrown in case the customer cannot be found.
     */
    Customer getCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Gets all customers.
     *
     * @return All customers.
     */
    List<Customer> getCustomers();

    /**
     * Gets a customer bound to a customer order.
     *
     * @param customerOrder The customer order from which the customer should be received.
     * @return The customer belonging to the customer order.
     * @throws CustomerNotFoundException Is thrown in case the customer order does not relate to a customer.
     */
    Customer getCustomerForCustomerOrder(CustomerOrder customerOrder) throws CustomerNotFoundException;

}

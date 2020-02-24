package sonnyboy.exercise.SpringBootExercise.service;

import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

import java.util.List;

/**
 * The customer service interface.
 */
public interface CustomerService {
    /**
     * Adds a customer to the datasource.
     * @param customer The customer that is to be added.
     * @return The added customer.
     * @throws CustomerNotFoundException Is thrown when the passed customer is empty.
     */
    Customer addCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Deletes a customer from the datasource.
     * @param customer The customer that is to be deleted.
     * @return The deleted customer
     * @throws CustomerNotFoundException Is thrown when the passed customer is empty.
     */
    Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Updates a customer in the datasource.
     * @param customer The customer that is to be updated (already including the updated fields).
     * @return The updated customer.
     * @throws CustomerNotFoundException Is thrown when the passed customer is empty.
     */
    Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Gets a customer by ID.
     * @param id The customer's ID.
     * @return The customer with the corresponding ID.
     * @throws CustomerNotFoundException Is thrown when no customer can be found with the ID.
     */
    Customer getCustomerById(long id) throws CustomerNotFoundException;

    /**
     * Gets customers by their first name.
     * @param firstName The customers' first name.
     * @return Customers with the corresponding first name.
     * @throws CustomerNotFoundException Is thrown when no customer can be found with the first name.
     */
    List<Customer> getCustomersByFirstName(String firstName) throws CustomerNotFoundException;

    /**
     * Gets customers by their last name.
     * @param lastName The customers' last name.
     * @return Customers with the corresponding last name.
     * @throws CustomerNotFoundException Is thrown when no customer can be found with the last name.
     */
    List<Customer> getCustomersByLastName(String lastName) throws CustomerNotFoundException;

    /**
     * Gets customers by their username.
     * @param username The customers' username.
     * @return Customers with the corresponding username.
     * @throws CustomerNotFoundException Is thrown when no customer can be found with the username.
     */
    List<Customer> getCustomersByUsername(String username) throws CustomerNotFoundException;

    /**
     * Gets all customers.
     * @return All customers.
     * @throws CustomerNotFoundException Is thrown when no customers can be found.
     */
    List<Customer> getAllCustomers() throws CustomerNotFoundException;
}

package sonnyboy.exercise.SpringBootExercise.service;

import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

import java.util.List;

/**
 * The customer service interface.
 */
public interface CustomerService {
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
     * Gets customers by their full name.
     * @param firstName The customers' first name.
     * @param lastName The customers' last name.
     * @return Customers with the corresponding full name.
     * @throws CustomerNotFoundException Is thrown when no customer can be found with the full name.
     */
    List<Customer> getCustomersByFullName(String firstName, String lastName) throws CustomerNotFoundException;

    /**
     * Gets a customer by username.
     * @param username The customer's username.
     * @return Customer with the corresponding username.
     * @throws CustomerNotFoundException Is thrown when no customer can be found with the username.
     */
    Customer getCustomerByUsername(String username) throws CustomerNotFoundException;

    /**
     * Gets all customers.
     * @return All customers.
     * @throws CustomerNotFoundException Is thrown when no customers can be found.
     */
    List<Customer> getAllCustomers() throws CustomerNotFoundException;

    /**
     * Adds a customer to the datasource.
     * @param customer The customer that is to be added.
     * @return The added customer.
     * @throws CustomerNotFoundException Is thrown when the passed customer is empty.
     */
    Customer addCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * Deletes a customer from the datasource.
     * @param id The customer's ID.
     * @return The deleted customer
     * @throws CustomerNotFoundException Is thrown when the passed customer is empty.
     */
    Customer deleteCustomer(long id) throws CustomerNotFoundException;

    /**
     * Updates a customer in the datasource.
     * @param customer The customer that is to be updated (already including the updated fields).
     * @return The updated customer.
     * @throws CustomerNotFoundException Is thrown when the passed customer is empty.
     */
    Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
}

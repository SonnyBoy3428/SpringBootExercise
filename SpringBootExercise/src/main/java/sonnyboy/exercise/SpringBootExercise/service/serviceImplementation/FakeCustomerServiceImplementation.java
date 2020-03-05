package sonnyboy.exercise.SpringBootExercise.service.serviceImplementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

/**
 * A mock implementation of a datasource for customer entities.
 * This fake implementation is nonsensical in that ids can be reused and also id gaps can occur.
 */
@Service
@Qualifier("fakeCustomerServiceImpl")
public class FakeCustomerServiceImplementation implements CustomerService {
    List<Customer> customerDb = new ArrayList<Customer>();

    @Override
    public Customer getCustomerById(long id) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        Customer foundCustomer = null;
        for(Customer customerEntity : customerDb){
            if(customerEntity.getId() == id){
                foundCustomer = customerEntity;
                break;
            }
        }

        if(foundCustomer.equals(null)){
            throw new CustomerNotFoundException("No customer with the id " + id + " exists.");
        }

        return foundCustomer;
    }

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        List<Customer> foundCustomers = null;
        for(Customer customerEntity : customerDb){
            if(customerEntity.getFirstName().equals(firstName)){
                foundCustomers.add(customerEntity);
            }
        }

        if(foundCustomers.equals(null) ||foundCustomers.isEmpty()){
            throw new CustomerNotFoundException("No customer with the first name " + firstName + " exists.");
        }

        return foundCustomers;
    }

    @Override
    public List<Customer> getCustomersByLastName(String lastName) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        List<Customer> foundCustomers = null;
        for(Customer customerEntity : customerDb){
            if(customerEntity.getLastName().equals(lastName)){
                foundCustomers.add(customerEntity);
            }
        }

        if(foundCustomers.equals(null) ||foundCustomers.isEmpty()){
            throw new CustomerNotFoundException("No customer with the last name " + lastName + " exists.");
        }

        return foundCustomers;
    }

    @Override
    public List<Customer> getCustomersByFullName(String firstName, String lastName) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        List<Customer> foundCustomers = null;
        for(Customer customerEntity : customerDb){
            if(customerEntity.getFirstName().equals(firstName) && customerEntity.getLastName().equals(lastName)){
                foundCustomers.add(customerEntity);
            }
        }

        if(foundCustomers.equals(null) ||foundCustomers.isEmpty()){
            throw new CustomerNotFoundException("No customer with the full name " + firstName + " " + lastName + " exists.");
        }

        return foundCustomers;
    }

    @Override
    public Customer getCustomerByUsername(String username) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        Customer foundCustomer = null;
        for(Customer customerEntity : customerDb){
            if(customerEntity.getUsername().equals(username)){
                foundCustomer = customerEntity;
                break;
            }
        }

        if(foundCustomer.equals(null)){
            throw new CustomerNotFoundException("No customer with the username " + username + " exists.");
        }

        return foundCustomer;
    }

    @Override
    public List<Customer> getAllCustomers() throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        return customerDb;
    }

    @Override
    public Customer addCustomer(Customer customer) throws CustomerNotFoundException {
        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot add an empty customer.");
        }

        if(customer.getId() <= 0){
            if(!customerDb.isEmpty()){
                customer.setId(customerDb.size());
            }else{
                customer.setId(1);
            }
        }
        customerDb.add(customer);

        return customer;
    }

    @Override
    public Customer deleteCustomer(long id) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        Customer customer = getCustomerById(id);

        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot delete an empty customer.");
        }

        customerDb.remove(customer);

        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
        if(customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        Customer customerToBeUpdated = getCustomerById(customer.getId());

        if(customer.equals(null) || customerToBeUpdated.equals(null)){
            throw new CustomerNotFoundException("Cannot update an empty customer.");
        }

        customerDb.remove(customerToBeUpdated);
        customerDb.add(customer);

        return customer;
    }
}

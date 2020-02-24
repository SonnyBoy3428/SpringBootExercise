package sonnyboy.exercise.SpringBootExercise.service.serviceImplementation;

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
@Service("fakeCustomerServiceImplementation")
public class FakeCustomerServiceImplementation implements CustomerService {
    List<Customer> customerDb = new ArrayList<Customer>();

    @Override
    public Customer addCustomer(Customer customer) throws CustomerNotFoundException {
        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot add an empty customer.");
        }

        customer.setId(customerDb.size());
        customerDb.add(customer);

        return customer;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException {
        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot delete an empty customer.");
        }

        customerDb.remove(customer);

        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot update an empty customer.");
        }

        for(Customer customerEntity : customerDb){
            if(customerEntity.getId() == customer.getId()){
                customerDb.remove(customerEntity);
                customerDb.remove(customer);
                break;
            }
        }

        return customer;
    }

    @Override
    public Customer getCustomerById(long id) throws CustomerNotFoundException {
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
    public List<Customer> getCustomersByUsername(String username) throws CustomerNotFoundException {
        List<Customer> foundCustomers = null;
        for(Customer customerEntity : customerDb){
            if(customerEntity.getUsername().equals(username)){
                foundCustomers.add(customerEntity);
            }
        }

        if(foundCustomers.equals(null) ||foundCustomers.isEmpty()){
            throw new CustomerNotFoundException("No customer with the username " + username + " exists.");
        }

        return foundCustomers;
    }

    @Override
    public List<Customer> getAllCustomers() throws CustomerNotFoundException {
        if(customerDb.equals(null) || customerDb.isEmpty()){
            throw new CustomerNotFoundException("No customers exist.");
        }

        return customerDb;
    }
}

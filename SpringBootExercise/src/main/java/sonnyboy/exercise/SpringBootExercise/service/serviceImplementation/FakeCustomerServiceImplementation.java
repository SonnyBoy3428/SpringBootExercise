package sonnyboy.exercise.SpringBootExercise.repository.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.repository.CustomerRepository;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeCustomer")
public class FakeCustomerDataAccessService implements CustomerRepository {
    List<Customer> customerDb = new ArrayList<Customer>();

    @Override
    public Customer addCustomer(Customer customer) throws CustomerNotFoundException{
        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot add an empty customer.");
        }

        customerDb.add(customer);

        return customer;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException{
        if(customer.equals(null)){
            throw new CustomerNotFoundException("Cannot delete an empty customer.");
        }

        customerDb.remove(customer);

        return customer;
    }

    @Override
    public Customer getCustomer(Customer customer) throws CustomerNotFoundException{
        Customer foundCustomer = null;
        for(Customer customerObject : customerDb){
            if(customerObject.getCustomerId() == customer.getCustomerId()){
                foundCustomer = customerObject;
                break;
            }
        }

        if(foundCustomer.equals(null)){
            throw new CustomerNotFoundException("Customer with the ID " + customer.getCustomerId() + " does not exist.");
        }

        return foundCustomer;
    }

    @Override
    public List<Customer> getCustomers() {

        return customerDb;
    }

    @Override
    public Customer getCustomerForCustomerOrder(CustomerOrder customerOrder) throws CustomerNotFoundException{
        if(customerOrder.getCustomer().equals(null)){
            throw new CustomerNotFoundException("Customer order with the ID " + customerOrder.getCustomerOrderId() + " does not relate to a customer.");
        }

        return customerOrder.getCustomer();
    }
}

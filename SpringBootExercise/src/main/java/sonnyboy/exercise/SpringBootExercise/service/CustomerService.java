package sonnyboy.exercise.SpringBootExercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerDao;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.List;

/**
 * The customer service.
 */
@Service
public class CustomerService {
    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(@Qualifier("fakeCustomer") CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public Customer addCustomer(Customer customer) throws CustomerNotFoundException {
        return this.customerDao.addCustomer(customer);
    }

    public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException {
        return this.customerDao.deleteCustomer(customer);
    }

    public Customer getCustomer(Customer customer) throws CustomerNotFoundException {
        return this.customerDao.getCustomer(customer);
    }

    public List<Customer> getCustomers() {
        return this.customerDao.getCustomers();
    }

    public Customer getCustomerForCustomerOrder(CustomerOrder customerOrder) throws CustomerNotFoundException {
        return this.customerDao.getCustomerForCustomerOrder(customerOrder);
    }
}

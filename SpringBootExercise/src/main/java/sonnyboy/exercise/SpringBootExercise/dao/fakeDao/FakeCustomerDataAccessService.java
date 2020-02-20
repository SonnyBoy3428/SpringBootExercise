package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerDao;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeCustomer")
public class FakeCustomerDataAccessService implements CustomerDao {
    List<Customer> customersDb = new ArrayList<Customer>();

    @Override
    public Customer addCustomer(Customer customer) {
        customersDb.add(customer);
    }

    @Override
    public Customer deleteCustomer(Customer customer) {
        customersDb.remove(customer);

        return customer;
    }

    @Override
    public Customer getCustomer(Customer customer) {
        Customer foundCustomer = null;
        for(Customer customerObject : customersDb){
            if(customerObject.getCustomerId() == customer.getCustomerId()){
                foundCustomer = customerObject;
                break;
            }
        }

        return foundCustomer;
    }

    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public List<Customer> getCustomerForCustomerOrder(CustomerOrder customerOrder) {
        return null;
    }
}

package sonnyboy.exercise.SpringBootExercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerDao;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

@Service
public class CustomerService {
    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(@Qualifier("fakeCustomer") CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public boolean addCustomer(Customer customer){
        return this.customerDao.addCustomer(customer);
    }
}

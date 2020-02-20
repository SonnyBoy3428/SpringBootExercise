package sonnyboy.exercise.SpringBootExercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerOrderDao;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

@Service
public class CustomerOrderService {
    private final CustomerOrderDao customerOrderDao;

    @Autowired
    public CustomerOrderService(@Qualifier("fakeCustomerOrder") CustomerOrderDao customerOrderDao){
        this.customerOrderDao = customerOrderDao;
    }

    public boolean addCustomerOrder(CustomerOrder customerOrder){
        return this.customerOrderDao.addCustomerOrder(customerOrder);
    }
}

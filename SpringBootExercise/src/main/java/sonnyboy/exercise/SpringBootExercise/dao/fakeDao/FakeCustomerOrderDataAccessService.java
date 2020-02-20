package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerOrderDao;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeCustomerOrder")
public class FakeCustomerOrderDataAccessService implements CustomerOrderDao {
    List<CustomerOrder> dB = new ArrayList<CustomerOrder>();

    @Override
    public boolean addCustomerOrder(CustomerOrder customerOrder) {
        dB.add(customerOrder);
        return true;
    }
}

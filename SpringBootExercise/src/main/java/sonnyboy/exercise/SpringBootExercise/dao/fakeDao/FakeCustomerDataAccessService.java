package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.CustomerDao;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeCustomer")
public class FakeCustomerDataAccessService implements CustomerDao {
    List<Customer> dB = new ArrayList<Customer>();

    @Override
    public boolean addCustomer(Customer customer) {
        dB.add(customer);
        return true;
    }
}

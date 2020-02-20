package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.EmployeeDao;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeEmployee")
public class FakeEmployeeDataAccessService implements EmployeeDao {
    private List<Employee> dB = new ArrayList<Employee>();
    @Override
    public boolean addEmployee(Employee employee) {
        dB.add(employee);
        return true;
    }
}

package sonnyboy.exercise.SpringBootExercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.dao.EmployeeDao;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(@Qualifier("fakeEmployee") EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public boolean addEmployee(Employee employee){
        return this.employeeDao.addEmployee(employee);
    }
}

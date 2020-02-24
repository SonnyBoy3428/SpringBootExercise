package sonnyboy.exercise.SpringBootExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.model.Employee;

/**
 * Repository for customer entities.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

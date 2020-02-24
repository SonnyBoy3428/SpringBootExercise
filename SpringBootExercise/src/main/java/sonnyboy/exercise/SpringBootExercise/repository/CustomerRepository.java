package sonnyboy.exercise.SpringBootExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

/**
 * Repository for customer entities.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

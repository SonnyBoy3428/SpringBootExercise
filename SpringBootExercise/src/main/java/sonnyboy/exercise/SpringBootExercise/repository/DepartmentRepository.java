package sonnyboy.exercise.SpringBootExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.model.Department;

/**
 * Repository for department entities.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

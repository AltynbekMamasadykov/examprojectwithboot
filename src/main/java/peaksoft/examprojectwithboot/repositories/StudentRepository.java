package peaksoft.examprojectwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.examprojectwithboot.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

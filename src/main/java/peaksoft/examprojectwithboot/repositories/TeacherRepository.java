package peaksoft.examprojectwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.examprojectwithboot.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}

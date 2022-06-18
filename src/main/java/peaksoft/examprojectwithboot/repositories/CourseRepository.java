package peaksoft.examprojectwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.examprojectwithboot.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
}

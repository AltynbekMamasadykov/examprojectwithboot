package peaksoft.examprojectwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.examprojectwithboot.entities.Group;

public interface GroupRepository extends JpaRepository<Group,Long> {
}

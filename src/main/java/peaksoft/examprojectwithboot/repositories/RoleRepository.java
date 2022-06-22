package peaksoft.examprojectwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.examprojectwithboot.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRoleName(String roleName);
}

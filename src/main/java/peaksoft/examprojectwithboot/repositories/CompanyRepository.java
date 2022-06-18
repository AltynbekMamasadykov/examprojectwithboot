package peaksoft.examprojectwithboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.examprojectwithboot.entities.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}

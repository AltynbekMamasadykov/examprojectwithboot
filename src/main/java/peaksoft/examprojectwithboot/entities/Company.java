package peaksoft.examprojectwithboot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "companies")
@Getter @Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "company_id_generator")
    @SequenceGenerator(name = "company_id_generator",sequenceName = "company_id_seq",allocationSize = 1)
    private Long id;
    private String companyName;
    private String LocatedCountry;


}

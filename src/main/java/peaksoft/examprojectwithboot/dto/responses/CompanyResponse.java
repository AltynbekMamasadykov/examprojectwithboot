package peaksoft.examprojectwithboot.dto.responses;

import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Course;

import java.util.List;

@Getter
@Setter
public class CompanyResponse {
    private Long id;
    private String companyName;
    private String LocatedCountry;
    private List<Course> course;
}

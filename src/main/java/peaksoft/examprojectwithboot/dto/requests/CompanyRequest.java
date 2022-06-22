package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Course;

import java.util.List;

@Getter @Setter
public class CompanyRequest {

    private String companyName;

    private String LocatedCountry;

    private List<Course> course;
}

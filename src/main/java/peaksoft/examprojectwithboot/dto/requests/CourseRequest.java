package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Company;

@Getter @Setter
public class CourseRequest {
    private String courseName;
    private String duration;
    private Company company;
}

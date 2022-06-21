package peaksoft.examprojectwithboot.dto.responses;
import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Company;

@Getter @Setter
public class CourseResponse {

    private Long id;

    private String courseName;

    private String duration;

    private Company company;
}

package peaksoft.examprojectwithboot.dto.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CourseResponse {
    private Long id;
    private String courseName;
    private String duration;
}

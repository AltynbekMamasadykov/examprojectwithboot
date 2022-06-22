package peaksoft.examprojectwithboot.dto.responses;
import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Course;

@Getter @Setter

public class TeacherResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Course course;
}

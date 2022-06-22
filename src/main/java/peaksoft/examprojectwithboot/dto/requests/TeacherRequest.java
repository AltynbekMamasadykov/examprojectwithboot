package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Course;

@Getter @Setter

public class TeacherRequest {

    private String firstName;

    private String lastName;

    private String email;

    private Course course;
}

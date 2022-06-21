package peaksoft.examprojectwithboot.dto.requests;
import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.enums.StudyFormat;

@Getter @Setter

public class StudentRequest {

    private String firstName;

    private String lastName;

    private String email;

    private StudyFormat studyFormat;

}

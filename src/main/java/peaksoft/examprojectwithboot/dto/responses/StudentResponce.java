package peaksoft.examprojectwithboot.dto.responses;

import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.enums.StudyFormat;

@Getter @Setter
public class StudentResponce {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private StudyFormat studyFormat;
}

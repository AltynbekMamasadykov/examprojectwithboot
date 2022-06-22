package peaksoft.examprojectwithboot.dto.responses;
import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Company;
import peaksoft.examprojectwithboot.entities.Group;
import peaksoft.examprojectwithboot.entities.Teacher;

import java.util.List;

@Getter @Setter
public class CourseResponse {

    private Long id;

    private String courseName;

    private String duration;

    private Company company;

    private List<Group> groups;

    private Teacher teacher;
}

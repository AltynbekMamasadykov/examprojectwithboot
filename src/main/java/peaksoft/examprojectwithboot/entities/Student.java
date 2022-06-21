package peaksoft.examprojectwithboot.entities;
import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.enums.StudyFormat;
import javax.persistence.*;

@Entity
@Getter @Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_id_generator",sequenceName = "student_id_seq",allocationSize = 1)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private StudyFormat studyFormat;

}

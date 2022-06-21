package peaksoft.examprojectwithboot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "groups")
@Getter @Setter
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "group_id_generator",sequenceName = "group_id_seq",allocationSize = 1)
    private Long id;
    private String groupName;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;
}

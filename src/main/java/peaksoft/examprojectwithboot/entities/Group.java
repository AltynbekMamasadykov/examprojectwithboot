package peaksoft.examprojectwithboot.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "groups")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter

public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "group_id_generator",sequenceName = "group_id_seq",allocationSize = 1)
    private Long id;

    private String groupName;

    @CreatedDate
    private LocalDate dateOfStart;

    @CreatedDate
    private LocalDate dateOfFinish;
}

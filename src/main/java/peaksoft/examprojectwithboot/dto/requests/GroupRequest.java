package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;

import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter @Setter

public class GroupRequest {
    private String groupName;

    @CreatedDate
    private LocalDate dateOfStart;

    @CreatedDate
    private LocalDate dateOfFinish;
}

package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterRequest {

    private String email;

    private String password;

    private String firstName;

}

package peaksoft.examprojectwithboot.dto.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyResponse {
    private Long id;
    private String companyName;
    private String LocatedCountry;
}

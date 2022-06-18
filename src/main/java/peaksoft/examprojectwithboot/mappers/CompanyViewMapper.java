package peaksoft.examprojectwithboot.mappers;

import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.responses.CompanyResponse;
import peaksoft.examprojectwithboot.entities.Company;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {

    public CompanyResponse viewCompany(Company company){
        CompanyResponse companyResponse = new CompanyResponse();
        companyResponse.setCompanyName(company.getCompanyName());
        companyResponse.setLocatedCountry(company.getLocatedCountry());
        return companyResponse;
    }

    public List<CompanyResponse> viewAllCompanies(List<Company> companies){
        List<CompanyResponse> companyResponses = new ArrayList<>();
        for (Company company:companies) {
            companyResponses.add(viewCompany(company));
        }
        return companyResponses;

    }
}

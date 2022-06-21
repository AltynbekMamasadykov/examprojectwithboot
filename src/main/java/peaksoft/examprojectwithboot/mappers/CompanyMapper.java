package peaksoft.examprojectwithboot.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.requests.CompanyRequest;
import peaksoft.examprojectwithboot.dto.responses.CompanyResponse;
import peaksoft.examprojectwithboot.entities.Company;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor

public class CompanyMapper {

    public CompanyResponse viewCompany(Company company){
        CompanyResponse companyResponse = new CompanyResponse();
        companyResponse.setId(company.getId());
        companyResponse.setCompanyName(company.getCompanyName());
        companyResponse.setLocatedCountry(company.getLocatedCountry());
        companyResponse.setCourse(company.getCourse());
        return companyResponse;
    }

    public List<CompanyResponse> viewAllCompanies(List<Company> companies){
        List<CompanyResponse> companyResponses = new ArrayList<>();
        for (Company company:companies) {
            companyResponses.add(viewCompany(company));
        }
        return companyResponses;
    }

    public Company create(CompanyRequest companyRequest){
        if (companyRequest == null){
            return null;
        }
        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());
        company.setCourse(companyRequest.getCourse());
        return company;
    }

    public void update(Company company, CompanyRequest companyRequest){
        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());
        company.setCourse(companyRequest.getCourse());
    }
}

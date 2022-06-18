package peaksoft.examprojectwithboot.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.CompanyRequest;
import peaksoft.examprojectwithboot.dto.responses.CompanyResponse;
import peaksoft.examprojectwithboot.entities.Company;
import peaksoft.examprojectwithboot.mappers.CompanyEditMapper;
import peaksoft.examprojectwithboot.mappers.CompanyViewMapper;
import peaksoft.examprojectwithboot.repositories.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyEditMapper companyEditMapper;
    private final CompanyViewMapper companyViewMapper;

    public CompanyResponse create(CompanyRequest companyRequest){
        Company company = companyEditMapper.create(companyRequest);
        companyRepository.save(company);
        return companyViewMapper.viewCompany(company);
    }


}

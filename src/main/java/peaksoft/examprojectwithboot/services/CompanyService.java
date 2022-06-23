package peaksoft.examprojectwithboot.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.CompanyRequest;
import peaksoft.examprojectwithboot.dto.responses.CompanyResponse;
import peaksoft.examprojectwithboot.entities.Company;
import peaksoft.examprojectwithboot.exceptions.NotFoundException;
import peaksoft.examprojectwithboot.mappers.CompanyMapper;
import peaksoft.examprojectwithboot.repositories.CompanyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;


    public CompanyResponse create(CompanyRequest companyRequest){
        Company company = companyMapper.create(companyRequest);
        companyRepository.save(company);
        return companyMapper.viewCompany(company);
    }

    private Company getCompanyById(Long id){
        return companyRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                    "Not Found with id " +id
                )
        );
    }

    public List<CompanyResponse> getAllCompanies(){
        return companyMapper.viewAllCompanies(companyRepository.findAll());
    }

    public CompanyResponse update(CompanyRequest companyRequest, Long id){
        Company company = getCompanyById(id);
        companyMapper.update(company,companyRequest);
        return companyMapper.viewCompany(companyRepository.save(company));
    }

    public CompanyResponse findById(Long id){
            Company company = getCompanyById(id);
            return companyMapper.viewCompany(company);
    }


    public CompanyResponse deleteById(Long id) {
            Company company = getCompanyById(id);
            companyRepository.delete(company);
            return companyMapper.viewCompany(company);
    }
}

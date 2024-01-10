package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/companies")
class CompanyController(
    private val companyRepository: CompanyRepository,
    private val companyMapper: CompanyMapper,
) {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): List<Company> = companyRepository.findAll()

    @Get("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getCompany(id: String): CompanyDto {
        val company = companyRepository.getById(id)
        return companyMapper.toDto(company)
    }
}
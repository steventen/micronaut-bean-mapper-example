package com.example

import io.micronaut.context.annotation.Mapper.Mapping
import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable
import jakarta.inject.Singleton

@Introspected
@Serdeable
data class CompanyDto(
    val companyName: String,
)

//interface CompanyMapper {
//    @Mapping(to = "companyName", from = "#{company.name}")
//    fun toDto(company: Company): CompanyDto
//}

@Singleton
abstract class CompanyMapper {
    // if use @Mapper without transformation works
    @Mapping(to = "companyName", from = "#{company.name}")
    abstract fun toDto(company: Company): CompanyDto
}
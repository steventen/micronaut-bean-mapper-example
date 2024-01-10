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

@Singleton
abstract class CompanyMapper {
    @Mapping(to = "companyName", from = "#{company.name}")
    abstract fun toDto(company: Company): CompanyDto
}
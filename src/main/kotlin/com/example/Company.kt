package com.example

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "companies")
@Serdeable
data class Company(
    @Id
    val id: String,

    @Column(name = "company_name")
    val name: String,

    @Column(name = "company_value")
    val value: BigDecimal?,
)
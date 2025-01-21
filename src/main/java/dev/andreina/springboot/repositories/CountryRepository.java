package dev.andreina.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.andreina.springboot.models.Country;

public interface CountryRepository extends JpaRepository <Country, Long> {

    Country findByCountry (String countryName);
    
}
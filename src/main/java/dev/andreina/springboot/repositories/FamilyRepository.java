package dev.andreina.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.andreina.springboot.models.Family;

public interface FamilyRepository  extends JpaRepository <Family, Long> {

    Family findByFamilyName (String familyName);

    
}
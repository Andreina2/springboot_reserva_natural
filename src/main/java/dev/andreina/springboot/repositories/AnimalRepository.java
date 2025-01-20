package dev.andreina.springboot.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.andreina.springboot.models.Country;
import dev.andreina.springboot.models.Family;

public interface AnimalRepository<Animal> extends JpaRepository <Animal, Long>{

    Page<Animal> findAll (Pageable pageable); // obtención de todos los animales con paginación : pageable

    Page<Animal> findByFamily (Family family, Pageable pageable); // obtención de los animales por familia con paginación : pageable

    List<Animal> findByCountry (Country country); // obtención de lista de animales por país sin paginación

    List <Animal> findByFamilyAndType(Family family, String type); // obtención de lista de animales por familia y por tipo sin paginación

    
}
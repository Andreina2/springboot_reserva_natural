package dev.andreina.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dev.andreina.springboot.models.Family;
import dev.andreina.springboot.models.Country;
import dev.andreina.springboot.models.Animal;
import dev.andreina.springboot.repositories.AnimalRepository;
import dev.andreina.springboot.repositories.CountryRepository;
import dev.andreina.springboot.repositories.FamilyRepository;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private FamilyRepository familyRepository;

    @Autowired
    private CountryRepository countryRepository;

    public Page<Animal> getAllAnimals(Pageable pageable) {
        return animalRepository.findAll(pageable);
    }
    
    public Page<Animal> getAnimalsByFamily(String familyName, Pageable pageable) {
        Family family = familyRepository.findByFamilyName(familyName);
        return animalRepository.findByFamily(family, pageable);
    }

    public List<Animal> getAnimalsByCountry(String countryName) {
        Country countryEntity = countryRepository.findByCountry(countryName);
        return animalRepository.findByCountry(countryEntity);
    }
    
    public List<Animal> getAnimalsByFamilyAndType(String familyName, String type) {
        Family family = familyRepository.findByFamilyName(familyName);
        return animalRepository.findByFamilyAndType(family, type);
    }
    

}

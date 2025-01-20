package dev.andreina.springboot.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String country;

    public Country() {}
    

    public Country(Long id, String country) {
        this.id = id;
        this.country = country;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

}

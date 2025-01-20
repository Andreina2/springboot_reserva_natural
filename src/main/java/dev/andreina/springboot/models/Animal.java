package dev.andreina.springboot.models;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Animal {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) // primary key

    //attributes
    private Long id;
    private String name;
    private String type;

    @ManyToOne
    private Family family; // Relación con el modelo Family
    private String gender;

    @ManyToOne
    private Country country; // Relación con el modelo Country
    private  Date date;
    //private img image; //extra

    
    // constructor
    public Animal(Long id, String name, String type, Family family, String gender, Country country, Date date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.family = family;
        this.gender = gender;
        this.country = country;
        this.date = date;
    }

    // getters y setters
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getFamily() {
        return family;
    }


    public void setFamily(Family family) {
        this.family = family;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(Country country) {
        this.country = country;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    
    
}



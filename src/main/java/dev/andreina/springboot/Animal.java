package dev.andreina.springboot;

import java.sql.Date;

public class Animal {

    private int id;
    private String name;
    private String type;
    private String family;
    private String gender;
    private String country;
    private  Date date;
    //private img image; //extra

    
    // constructor
    public Animal(int id, String name, String type, String family, String gender, String country, Date date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.family = family;
        this.gender = gender;
        this.country = country;
        this.date = date;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
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


    public void setFamily(String family) {
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


    public void setCountry(String country) {
        this.country = country;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    // getters y setters
    
}



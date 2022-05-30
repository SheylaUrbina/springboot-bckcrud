package com.spring.boot.bck.crud.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Country")
public class Country{


    @Id
    @Column(name = "country_id")
    private int id;

    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastUpdate;


    @OneToMany(mappedBy = "country",
            cascade=CascadeType.ALL,
            fetch = FetchType.LAZY
            )
   // @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"}, allowSetters = true)
   // @JoinColumn(name = "country_id")
    private List<City> cities = new ArrayList<>();

    public Country() {
    }

    public Country(int id, String country, Date lastUpdate) {
        this.id = id;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
        for(City c : cities){
            c.setCountry(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

package com.spring.boot.bck.crud.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="City")
public class City {


    @Id
    @Column(name = "city_id")
    private int city_id;

    @Column(name = "city")
    private String city;



    @Column(name = "last_update")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdate;

    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Country country;

    public City() {
    }

    public City(int city_id, String city,  Date lastUpdate, Country country) {
        this.city_id = city_id;
        this.city = city;
         this.lastUpdate = lastUpdate;
        this.country = country;
    }



    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }



    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


}

package com.spring.boot.bck.crud.interfaces;

import com.spring.boot.bck.crud.modelo.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICountry extends CrudRepository<Country,Integer> {

    @Query("select j from Country j where j.id=:valor")
    public Country findByCountry(int valor);
}

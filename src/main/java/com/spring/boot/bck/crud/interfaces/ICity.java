package com.spring.boot.bck.crud.interfaces;

import com.spring.boot.bck.crud.modelo.City;
import com.spring.boot.bck.crud.modelo.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICity extends CrudRepository<City,Integer> {


    @Query("select i from City i where i.city_id=:vcodigo")
    public City findByIdCity(int vcodigo);


}

package com.spring.boot.bck.crud.interfaceService;

import com.spring.boot.bck.crud.modelo.City;
import com.spring.boot.bck.crud.modelo.Country;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IcilyService {

    public List<City> listar();


    public City findByIdCity(int vcodigo);
    public List<City> findByCityAndCountry(int vcodigo);
}

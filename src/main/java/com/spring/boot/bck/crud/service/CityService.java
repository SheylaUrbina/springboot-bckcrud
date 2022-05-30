package com.spring.boot.bck.crud.service;

import com.spring.boot.bck.crud.interfaceService.IcilyService;
import com.spring.boot.bck.crud.interfaces.ICity;
import com.spring.boot.bck.crud.modelo.City;
import com.spring.boot.bck.crud.modelo.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CityService implements IcilyService {

    @Autowired
    private ICity icity;

    @Override
    public List<City> listar() {
        return  (List<City>)icity.findAll();
    }




    @Override
    public City findByIdCity(int vcodigo) {

        return icity.findByIdCity(vcodigo);
    }

    @Override
    public List<City> findByCityAndCountry(int vcodigo) {
        return null;
    }


}

package com.spring.boot.bck.crud.interfaceService;

import com.spring.boot.bck.crud.modelo.City;
import com.spring.boot.bck.crud.modelo.Country;

import java.util.List;

public interface ICountryService {
    public Country findByCountry(int vCountry);
    public List<Country> findAllCountries();
}

package com.spring.boot.bck.crud.service;

import com.spring.boot.bck.crud.interfaceService.ICountryService;
import com.spring.boot.bck.crud.interfaces.ICountry;
import com.spring.boot.bck.crud.modelo.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountry iCountry;
    @Override
    public Country findByCountry(int vCountry) {
        return iCountry.findByCountry(vCountry);
    }

    @Override
    public List<Country> findAllCountries() {
        return (List<Country>) iCountry.findAll();
    }
}

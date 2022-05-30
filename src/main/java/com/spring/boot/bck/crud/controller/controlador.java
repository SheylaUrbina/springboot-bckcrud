package com.spring.boot.bck.crud.controller;


import com.spring.boot.bck.crud.interfaceService.ICountryService;
import com.spring.boot.bck.crud.interfaceService.IcilyService;
import com.spring.boot.bck.crud.interfaces.ICountry;
import com.spring.boot.bck.crud.modelo.City;
import com.spring.boot.bck.crud.modelo.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class controlador {

    @Autowired
    private IcilyService icityService;

    @Autowired
    private ICountryService icountryService;

    @Autowired
    private ICountry iCountry;

    @GetMapping("/test/{valor}")
    public String test(@PathVariable String valor) {
        return "prueba: "+valor;
    }

    @GetMapping("/cities")
    public List<City> listar() {
        return icityService.listar();
    }

    @GetMapping("/countries/{valor}")
    public Country countries(@PathVariable int valor) {
        return icountryService.findByCountry(valor);
    }

    @GetMapping("/countries")
    public List<Country> countries() {
        return icountryService.findAllCountries();
    }


    @GetMapping("/cities/{valor}")
    public City cityAndCountry(@PathVariable int valor){
        return icityService.findByIdCity(valor);
    }
}

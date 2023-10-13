package com.movieticketbooking.service;

import com.movieticketbooking.service.Interface.ICityService;
import com.movieticketbooking.entity.City;
import com.movieticketbooking.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityService implements ICityService {
    private CityRepository cityRepository;
//    public City addCity(String name){
//        City city = new City();
//        city.setCity_name(name);
//        return cityRepository.addCity(String.valueOf(city));
//    }
//    public City updateCity(String name){
//        City city = new City();
//        city.setCity_name(name);
//        return cityRepository.updateCity(String.valueOf(city));
//    }


}

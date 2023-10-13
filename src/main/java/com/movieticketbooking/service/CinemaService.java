package com.movieticketbooking.service;

import com.movieticketbooking.entity.Cinema;
import com.movieticketbooking.entity.City;
import com.movieticketbooking.repository.CinemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CinemaService {
    private CinemaRepository cinemaRepository;
//    public Cinema addCinema(String name){
//        Cinema cinema = new Cinema();
//        cinema.setCinema_name(name);
//        return cinemaRepository.addCinema(String.valueOf(cinema));
//    }
//    public Cinema addSeats(String name){
//        Cinema cinema = new Cinema();
//        cinema.setSeat_name(name);
//        return cinemaRepository.addSeats(String.valueOf(cinema));
//    }
}

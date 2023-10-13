package com.movieticketbooking.api.user;

import com.movieticketbooking.entity.Cinema;
import com.movieticketbooking.entity.Seats;
import com.movieticketbooking.service.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class CinemaController {

    private CinemaService cinemaService;

//    @PostMapping("/add")
//    public Cinema addCinema(@RequestBody String name) {
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cinemaService.addCinema(name)).getBody();}
//
//    @PostMapping("/add")
//    public Cinema addSeats(@RequestBody String name) {
//            return ResponseEntity.status(HttpStatus.ACCEPTED).body(cinemaService.addSeats(name)).getBody();
//    }

    public Cinema deleteCinema(@RequestBody Cinema cinema) {
        return null;
    }
    public Seats deleteSeats(@RequestBody Seats seats){
        return null;
    }
}

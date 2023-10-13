package com.movieticketbooking.api.user;

import com.movieticketbooking.entity.City;
import com.movieticketbooking.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

//    @PostMapping("/add")
//    public ResponseEntity<?> addCity(@RequestBody String name) {
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cityService.addCity(name));
//    }
//
//    @PostMapping("/get")
//    public ResponseEntity<?> updateCity(@RequestBody String name) {
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cityService.updateCity(name));
//    }
}

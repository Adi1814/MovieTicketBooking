package com.movieticketbooking.repository;

import com.movieticketbooking.entity.Cinema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends CrudRepository<Cinema,Long> {
//   Cinema addCinema(String name);
//   Cinema addSeats(String id);
}

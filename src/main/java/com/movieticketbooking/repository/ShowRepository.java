package com.movieticketbooking.repository;

import com.movieticketbooking.entity.Shows;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface ShowRepository extends CrudRepository<Shows, String>
{
    ArrayList<Shows> findShowsByID(String showID);
    Shows findShowsByMovie_id(String name);

}

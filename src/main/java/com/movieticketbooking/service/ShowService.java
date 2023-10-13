package com.movieticketbooking.service;

import com.movieticketbooking.service.Interface.IShowService;
import com.movieticketbooking.entity.Shows;
import com.movieticketbooking.repository.ShowRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService implements IShowService {
    private ShowRepository showRepository;

    public Shows addshows(Shows shows){
       return showRepository.save(shows);
    }
    public List<Shows> getAllShows() {return (List<Shows>) showRepository.findAll();}

    public ArrayList<Shows> findShowsByID(String id){return showRepository.findShowsByID(id);}

    public Shows findShowsByName(String id){return showRepository.findShowsByName(id);}

}

package com.movieticketbooking.service.Interface;

import com.movieticketbooking.entity.Shows;

import java.util.ArrayList;
import java.util.List;

public interface IShowService {
    public Shows addshows(Shows shows);
    public List<Shows> getAllShows();
    public ArrayList<Shows> findShowsByID(String id);

    public Shows findShowsByName(String id);
}

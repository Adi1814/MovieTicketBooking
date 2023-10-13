package com.movieticketbooking.service.Interface;

import com.movieticketbooking.entity.Users;

import java.util.List;

public interface IUserService {

    public void addUser(String name);
    public List<Users> getAllUsers();
    public Users getUserById(int id);
    public Users getUsersByEmail(String email);

}

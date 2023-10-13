package com.movieticketbooking.service;

import com.movieticketbooking.service.Interface.IUserService;
import com.movieticketbooking.entity.Users;
import com.movieticketbooking.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private UserRepository userRepository;
    public void addUser(String name) {
        Users users = new Users();
        users.setFirstName(name);
        userRepository.save(users);
        return;
    }
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    public Users getUserById(int id) {
        return userRepository.findById(id).orElseThrow (
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Users getUsersByEmail(String email) {
        return userRepository.findUserByEmail(email).orElseThrow (
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}

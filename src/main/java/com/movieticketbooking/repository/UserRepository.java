package com.movieticketbooking.repository;

import com.movieticketbooking.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {

    Optional<Users> findUserByEmail(String email);

}

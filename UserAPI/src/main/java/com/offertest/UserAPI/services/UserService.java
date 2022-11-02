package com.offertest.UserAPI.services;

import com.offertest.UserAPI.entities.UserEntity;
import com.offertest.UserAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    // registered user
public  UserEntity  saveUser( UserEntity user)
{
    userRepository.save(user);
    return user ;
}
// find  all users in database
public Iterable<UserEntity> findAll(){ return userRepository.findAll();}

// find user by id
public UserEntity findById(Integer id){return userRepository.findById(id).get(); }




}



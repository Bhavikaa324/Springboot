package com.example.demo.services;
import org.springframework.stereotype.Service;

import  java.util.*;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

     public List<UserInfo> getAllUsers(){
        return  userRepository.getAllUsers();
    }

    public UserInfo createUser(UserInfo userInfo){
        return userRepository.createUser(userInfo);
    }

}
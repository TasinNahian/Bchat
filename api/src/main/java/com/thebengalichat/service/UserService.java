package com.thebengalichat.service;

import com.thebengalichat.exception.UserException;
import com.thebengalichat.model.User;
import com.thebengalichat.request.UpdateUserRequest;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {

    public User findUserById(Integer id) throws UserException;
    public User findUserProfile(String jwt) throws UserException;
    public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;
    public List<User> searchUser(String query);
}

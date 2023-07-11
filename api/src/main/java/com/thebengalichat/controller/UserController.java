package com.thebengalichat.controller;

import com.thebengalichat.exception.UserException;
import com.thebengalichat.model.User;
import com.thebengalichat.request.UpdateUserRequest;
import com.thebengalichat.response.ApiResponse;
import com.thebengalichat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfileHandler(@RequestHeader("Authorization") String token) throws UserException {
        User user = userService.findUserProfile(token);
        return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
    }
    @GetMapping("/{query}")
    public ResponseEntity<List<User>> searchUserHandler(@PathVariable("query") String query){
        List<User> users  = userService.searchUser(query);
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ApiResponse> updateUserHandler(@RequestBody UpdateUserRequest req, @RequestHeader("Authorization") String token) throws UserException {
        User user = userService.findUserProfile(token);
        userService.updateUser(user.getId(), req);
        ApiResponse res = new ApiResponse("User update successfully", true);
        return new ResponseEntity<ApiResponse>(res, HttpStatus.ACCEPTED);
    }

}

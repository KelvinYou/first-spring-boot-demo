package com.example.demo3.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

  /**
   * Add new user into Database
   * 
   * use Postman
   * method: POST
   * url: http://localhost:8080/users/
   * Body > raw > JSON
   * test with:
      {
          "userId": 3,
          "username": "Kelvin",
          "age": 18,
          "gender": "male"
      }
   * @param user
   * @return
   */
  @PostMapping("/")
  public ResponseEntity<Map<String, Object>> addUser(@RequestBody User user) {
    // TODO: Add code to save user to database
    
    // In this example, we'll just return a success response with the user details
    Map<String, Object> response = new HashMap<>();
    response.put("success", true);
    response.put("message", "User added successfully");
    response.put("user", user);
    return ResponseEntity.ok(response);
  }
    
}

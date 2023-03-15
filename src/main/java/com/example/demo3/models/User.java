package com.example.demo3.models;

public class User {
  private Long userId;
  private String username;
  private int age;
  private String gender;
  
  public User(Long userId, String username, int age, String gender) {
      this.userId = userId;
      this.username = username;
      this.age = age;
      this.gender = gender;
  }
  
  public Long getUserId() {
      return userId;
  }
  
  public void setUserId(Long userId) {
      this.userId = userId;
  }
  
  public String getUsername() {
      return username;
  }
  
  public void setUsername(String username) {
      this.username = username;
  }
  
  public int getAge() {
      return age;
  }
  
  public void setAge(int age) {
      this.age = age;
  }
  
  public String getGender() {
      return gender;
  }
  
  public void setGender(String gender) {
      this.gender = gender;
  }
}


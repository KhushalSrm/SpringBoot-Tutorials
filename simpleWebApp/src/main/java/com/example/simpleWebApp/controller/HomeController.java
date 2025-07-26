package com.example.simpleWebApp.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping("/")
  // @ResponseBody or we can use controller above and here ,we can add this Response body,it specifies that we are not looking for layout we are loooking for text
  public String greet(){
    return "Welcome to the Page!!";
  }

  @RequestMapping("/about")
  public String about(){
    return "I am a CSE Student and i love codinggggggg ,but it sucksssssss";
  }
}

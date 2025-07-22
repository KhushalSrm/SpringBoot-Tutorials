package com.Khushal.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

  public void compiler(){
    System.out.println("Compiling the code...");
  }
}
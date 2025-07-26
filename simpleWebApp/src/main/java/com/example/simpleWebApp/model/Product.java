package com.example.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//this class represents a product

@Data //this creates getters and setters
@AllArgsConstructor //this creates a constructor that initializes all the fields


public class Product {
  private int prodId;
  private String prodName;
  private int Price ;

  public Product() {} //empty constructor because jackson needs it

}

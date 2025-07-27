package com.example.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

//this class represents a product

@Data //this creates getters and setters
@AllArgsConstructor //this creates a constructor that initializes all the fields
@Entity

public class Product {
  @Id
  private int prodId;
  private String prodName;
  private int Price ;

  public Product() {} //empty constructor because jackson needs it

}

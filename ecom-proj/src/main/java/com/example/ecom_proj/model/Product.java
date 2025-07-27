package com.example.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

  @Id   //specifies that the var below this annotation is the primary key to the table
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int prodId;
  private String name;
  private String desc;
  private String brand;
  private BigDecimal price;
  private String category;
  private Date releaseDate;
  private boolean available;
  private int quantity;


}

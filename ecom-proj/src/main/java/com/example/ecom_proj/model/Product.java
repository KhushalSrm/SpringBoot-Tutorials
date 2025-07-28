package com.example.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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

  //@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "dd-MM-yyyy")   -->handled in the ui itself
  //used to convert date from 2022-10-31T18:30:00.000+00:00 format to dd-mm-yyyy format 
  private Date releaseDate;
  private boolean available;
  private int quantity;

  private String imageName;
  private String imageType;
  @Lob
  private byte[] imageData;

}

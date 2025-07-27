package com.example.ecom_proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

  @Autowired
  private ProductService service;


  @RequestMapping("/")
  public String greet(){
    return "Welcome to the Ecommerce Site..";
  }

  @GetMapping("/products")
  public List<Product> getAllProducts(){
    return service.getAllProducts();
  }

}

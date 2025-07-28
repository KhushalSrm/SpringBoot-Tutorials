package com.example.ecom_proj.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
  public ResponseEntity<List<Product>> getAllProducts(){
    return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
  }

  @GetMapping("/products/{prodId}")
  public ResponseEntity<Product>getProdById(@PathVariable Integer prodId){

    if(prodId != null){
      return new ResponseEntity<>(service.getProductById(prodId),HttpStatus.OK);
    }else{
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/product")
  public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
    try{
      return new ResponseEntity<>(service.addProduct(product, imageFile),HttpStatus.CREATED);
    }catch(Exception e){
      return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
    }
  }

}
 
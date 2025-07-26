package com.example.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;

@RestController
public class ProdcutController {

  @Autowired
  ProductService service;

  @GetMapping("/products")
  public List<Product> getProducts(){
    return service.getProducts();
  }

  @GetMapping("/products/{prodId}")
  public Product getProductById(@PathVariable int prodId){ //pathvariable is used to get the query parameter from the url
    return service.getProductById(prodId);
  }

  @PostMapping("/products")
  public void addProduct(@RequestBody Product product){  //requestbody is used to get the data,from the client side
    System.out.println(product);
    service.addProduct(product);
  }

  @PutMapping("/products")
  public void updateProduct(@RequestBody Product product){
    service.updateProduct(product);
    System.out.println("product updated");
  }

  @DeleteMapping("/products/{prodId}")
  public void deleteProduct(@PathVariable int prodId){
    service.deleteProduct(prodId);
  }

  
}

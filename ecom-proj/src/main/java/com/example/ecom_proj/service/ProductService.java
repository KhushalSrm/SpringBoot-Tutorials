package com.example.ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.repository.ProductRepo;

@Service
public class ProductService {

  @Autowired
  ProductRepo repo;

  public List<Product> getAllProducts(){
    return repo.findAll();
  }
}

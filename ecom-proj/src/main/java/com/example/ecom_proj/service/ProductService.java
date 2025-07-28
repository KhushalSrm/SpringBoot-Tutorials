package com.example.ecom_proj.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.repository.ProductRepo;

@Service
public class ProductService {

  @Autowired
  ProductRepo repo;

  public List<Product> getAllProducts(){
    return repo.findAll();
  }

  public Product getProductById(Integer prodId) {
    return repo.findById(prodId).orElse(null);  // instead of get() we can also use orElse(new Product())
  }

  public Object addProduct(Product product, MultipartFile imageFile) throws IOException {
    product.setImageName(imageFile.getOriginalFilename());
    product.setImageType(imageFile.getContentType());
    product.setImageData(imageFile.getBytes());
    return repo.save(product);
  }



}

package com.example.simpleWebApp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;

@Service   //this annotation tells that this class is a service,it also has @component in it
public class ProductService {

  @Autowired
  ProductRepo repo;


  public List<Product> getProducts(){
    return repo.findAll();
  }


  //the conversion of json object to java object and vice versa is done by jackson
  public Product getProductById(int prodId){
    return repo.findById(prodId).get();
  }

  public void addProduct(Product product){
    repo.save(product);
  }

  public void updateProduct(Product product){
    repo.save(product);
  }


  public void deleteProduct(int prodId) {
   repo.deleteById(prodId);
  }
}

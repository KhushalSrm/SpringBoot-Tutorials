package com.example.simpleWebApp.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.simpleWebApp.model.Product;

@Service   //this annotation tells that this class is a service,it also has @component in it
public class ProductService {

  List<Product> products =new ArrayList<>( Arrays.asList(new Product(1,"Laptop",50000),new Product(2,"Mobile",15000),new Product(3,"Tablet",30000)));


  public List<Product> getProducts(){
    return products;
  }


  //the conversion of json object to java object and vice versa is done by jackson
  public Product getProductById(int prodId){
    return products.stream()
              .filter(p -> p.getProdId() == prodId)
              .findFirst().get();
  }

  public void addProduct(Product product){
    products.add(product);
  }

  public void updateProduct(Product product){
    products.forEach(p -> {
      if(p.getProdId() == product.getProdId()){
        p.setProdName(product.getProdName());
        p.setPrice(product.getPrice());
      }
    });

    //or
    // for(int i=0;i<products.size();i++){
    //   if(products.get(i).getProdId() == product.getProdId()){
    //     products.set(i,product);
    //   }
    // }
  }


  public void deleteProduct(int prodId) {
    products.removeIf(p -> p.getProdId() == prodId);

    //or
    // for(int i=0;i<products.size();i++){
    //   if(products.get(i).getProdId() == prodId){
    //     products.remove(i);
    //   }
    // }
  }
}

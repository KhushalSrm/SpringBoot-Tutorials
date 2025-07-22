package com.Khushal.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component    // this is used to create a bean,so that spring know it has to manage this class
public class Dev {
   
    @Autowired
    @Qualifier("laptop")
    private Computer comp;
    // now since both Laptop and Desktop implements Computer interface, so we can use Laptop or Desktop in place of Computer
    //this woudl throw an error, so we need to use @Qualifier annotation,since the spring doesn't know which class to use for Laptop or Desktop,or primary or secondary
    //error is field requires a single bean of type 'Computer' that matches the autowired annotation,but got multiple beans



    //@Autowired  // this is called field injection
    //private Laptop lap;

    // public Dev(Laptop lap){ this is called constructor injection
    //   this.lap = lap;
    // }

    //@Autowired
    // public void setLap(Laptop lap){  this is called setter injection
    //   this.lap = lap;
    // }

    //for field injecttion and setter injection, we need to use @Autowired

  public void code(){
    comp.compiler();
    System.out.println("I am coding....");
  }

}

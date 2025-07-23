package com.Khushal.DemoSpring;

class Dev{
  private int age;  //since ut is private ,we'll need getters and setters to access it
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  // public Dev(int age){  //constructor to set the age ,just a demo,setting the object of laptop is the actual goal
  //   this.age = age;
  // }

  private Laptop laptop;

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public Dev(Laptop laptop) {
    this.laptop = laptop;
  }

  public void code(){
    System.out.println("Develper is coding...." );
    laptop.compile();
  }
}
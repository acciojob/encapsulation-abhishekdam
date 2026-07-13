package com.driver;

public class Main {
  public static void main(String[] args) {
      RWOnly obj = new RWOnly();
//      obj.name = "foo"; // 'name' has private access in 'com.driver.RWOnly'
//      System.out.print(obj.name);
      obj.setName("Abhishek");
      System.out.print(obj.getName());
  }
}
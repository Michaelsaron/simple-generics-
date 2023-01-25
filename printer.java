package com.example.myapplication;

public class Printer <T>{

T thingToPrint;

 public Printer(T thingToPrint);{
  this.thingToPrint = thingToPrint;
}
 public void print(){
  system.out.println(thingToPrint);
  
  }
}
package com.example.myapplication;

public class GenericsExample {

  public static void main(string[] args){

 printer<Integer> printer = new Printer<>(23);
 printer.print();
 
 printer<Double> doubleprinter = new printer<>(22.3);
 doubleprinter.print();
 }
 
 }
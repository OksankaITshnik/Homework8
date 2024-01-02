package main.java;

import java.sql.SQLOutput;

public class Shape {
    protected String name;
    public Shape(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("The figure is " + name);
    }
}

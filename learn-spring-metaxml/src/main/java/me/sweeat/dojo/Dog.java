package me.sweeat.dojo;
public class Dog{
    private int age;
    public String color;
    private double price;
    public Dog(String color,int age){
        this.color=color;
        this.age=age;
    }
    public Dog(String color,int age,double price){
        this.color=color;
        this.age=age;
        this.price=price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
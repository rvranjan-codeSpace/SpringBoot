package com.example.demo.service;

public class CustomPizza implements Pizza{
    String name, topping;
    @Override
    public String getPizza() {
        return "This is a custom pizza";
    }
    public CustomPizza(String name, String topping){
        this.name = name;
        this.topping = topping;
    }

    public String getCustomPizza(){
        return "This is custom Pizza with PizzaName :"+this.name+" and topping:"+this.topping;
    }
}

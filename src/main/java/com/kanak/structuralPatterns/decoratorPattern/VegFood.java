package com.kanak.structuralPatterns.decoratorPattern;

public class VegFood implements Food {
    public String prepareFood(){
        return "Veg Food";
    }

    public double foodPrice(){
        return 50.0;
    }
}

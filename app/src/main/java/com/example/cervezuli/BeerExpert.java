package com.example.cervezuli;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "Amber":
                brands.add("amber1");
                brands.add("amber2");
                break;
            case "Brown":
                brands.add("brown1");
                brands.add("brown2");
                break;
            case "Light":
                brands.add("light1");
                brands.add("light2");
                break;
            default:
                brands.add("black1");
                brands.add("black2");
                break;
        }
        return brands;
    }
}

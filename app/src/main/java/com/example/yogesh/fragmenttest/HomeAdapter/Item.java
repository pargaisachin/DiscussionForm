package com.example.yogesh.fragmenttest.HomeAdapter;

/**
 * Created by YOGESH on 4/16/2018.
 */
public class Item {

    String animalName;
    int animalImage;

    public Item(String animalName,int animalImage)
    {
        this.animalImage=animalImage;
        this.animalName=animalName;
    }
    public String getAnimalName()
    {
        return animalName;
    }
    public int getAnimalImage()
    {
        return animalImage;
    }
}

package com.example.gitanjali.something;

public class Fruit {

    String fruitName;
    int imageId;

    public Fruit(String fruitName,int imageId){
        this.fruitName=fruitName;
        this.imageId=imageId;
    }

    public String getFruitName(){
        return  fruitName;
    }

    public int getImageId() {
        return imageId;
    }
}

package com.example.tablayoutcollapsetoobal;

public class Movie {
    private int img;
    private String name;
    private String price;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Movie(int img, String name, String price) {
        this.img = img;
        this.name = name;
        this.price = price;
    }
}

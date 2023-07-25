package org.example;

public class Dish {
    private int dishid;
    private String name;
    private float price;
    private int restroid;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDishid() {
        return dishid;
    }

    public void setDishid(int dishid) {
        this.dishid = dishid;
    }

    public int getRestroid() {
        return restroid;
    }

    public void setRestroid(int restroid) {
        this.restroid = restroid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

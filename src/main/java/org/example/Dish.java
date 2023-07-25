package org.example;

public class Dish {
     String dishid;
     String name;
     float price;
     String restroid;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDishid() {
        return dishid;
    }

    public void setDishid(String dishid) {
        this.dishid = dishid;
    }

    public String getRestroid() {
        return restroid;
    }

    public void setRestroid(String restroid) {
        this.restroid = restroid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

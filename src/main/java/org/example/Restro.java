package org.example;
import java.util.List;
public class Restro {
     String restroid;
     String name;
     List<Dish> menu;
     Location location;

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

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Restro{" +
                "restroid='" + restroid + '\'' +
                ", name='" + name + '\'' +
                ", menu=" + menu +
                ", location=" + location +
                '}';
    }
}

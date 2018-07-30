package model;

import java.awt.*;

public class Motorcycle {

    private final String engine;
    private final int capacity;
    private final int fuelCapacity;
    private final int mass;
    private final int horsePower;
    private final int productionYear;
    private final Image motoPhoto;
    private final String name;
    private final int price;

    public Motorcycle(Image photo, int productionYear, String engine, int capacity, int fuelCapacity, int mass, int horsePower, String name, int price) {
        this.engine = engine;
        this.capacity = capacity;
        this.fuelCapacity = fuelCapacity;
        this.mass = mass;
        this.horsePower = horsePower;
        this.productionYear = productionYear;
        this.motoPhoto = photo;
        this.name = name;
        this.price = price;
    }

    public Image getMotoPhoto() {
        return motoPhoto;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getEngine() {
        return engine;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getMass() {
        return mass;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getName() {
        return name;
    }

}

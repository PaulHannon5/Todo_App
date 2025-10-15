package com.vehicle;

public class Vehicle {

    public int id;

    public String makeModel;

    public double weight;

    public Vehicle(int id, String makeModel, double weight) {
        this.id = id;
        this.makeModel = makeModel;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", makeModel='" + makeModel + '\'' +
                ", weight=" + weight +
                '}';
    }
}

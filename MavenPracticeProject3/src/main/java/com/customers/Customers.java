package com.customers;

public class Customers {
     public int id;

     public String name;

     public double outstandingBalance;

    public Customers(int id, String name, double outstandingBalance) {
        this.id = id;
        this.name = name;
        this.outstandingBalance = outstandingBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;


    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outstandingBalance=" + outstandingBalance +
                '}';
    }
}

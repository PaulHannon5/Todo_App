package com.pluralsight;

import java.sql.SQLOutput;

public class Tarnished {
    String lastName;
    int age = 1000;
    String firstName;
    double manaCount;
    private  String pincode;

    public Tarnished() {
        this.pincode = "1234";

    }
    public void introduction() {
        System.out.println("Hi my name = " + this.firstName);
    }

    public static void GenericIntroduction() {
        System.out.println("Hi - I'm introducing myself");
    }





}





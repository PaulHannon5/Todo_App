package com.vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("What kind of car is this?");

        Vehicle me = new Vehicle(20, "47' Kubrick", 28.8);

        System.out.println(me.toString());
        System.out.println(me);
    }
}
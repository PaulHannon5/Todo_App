package com.customers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Customers me = new Customers(527, "Paul H.", 125.00f);

        System.out.println(me.toString());
        System.out.println(me);
    }
}
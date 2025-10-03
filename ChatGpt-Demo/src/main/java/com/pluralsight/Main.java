package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String tarnishedName = "Tamriel";
        int tarnishedLevel = 366;
        double manaCount = 75.6;

        int swordStrikes = 5;

        while (swordStrikes <= 5) {
            System.out.println("You've hit the enemy 5 times");
            swordStrikes++;
        }
        System.out.println("You've vanquished the enemy."); }
    public static void attack(String Enemy) {
        System.out.println("You attack the [enemy] ");

        Tarnished t1 = new Tarnished();
        t1.age = 1000;
        t1.lastName = "Ofnir";
        t1.firstName = "Gideon";

        Tarnished t2 = new Tarnished();
        t2.age = 40;
        t2.lastName = "Dung";
        t2.firstName = "Eater";

        EldenLord e1 = new EldenLord();
        e1.name = "Godfrey";
        e1.runes = 1000000;

        EldenLord e2 = new EldenLord();
        e2.name = "Radagon";
        e2.runes = 2000000;


    }
}
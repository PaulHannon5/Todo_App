package com.pluralsight;

public class EldenLord {

    String name;
    int runes;

    public void PowerUp(){
        this.runes = this.runes *2;
    }

    public void Stats() {
        System.out.println(this.name + " powerlevel " + this.runes);
        if (this.runes > 10000) {
            System.out.println("Foul Tarnished, in search of the Elden Ring");
        }
        public void Attack
    }
}
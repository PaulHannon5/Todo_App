package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my Todo App");
        Task t1 = new Task ("Learn Java");
        Task t2 = new Task ("Commit changes to Git");
        Task t3 = new Task("Finalize my projects");
        System.out.println(t1 + "\n" + t2 + "\n" + t3);
    }

}
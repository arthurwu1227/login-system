package com.company;

import java.util.Scanner;

public class menu {
    public String callMenu(){
        //I only have one method here right now, but I might want to add
        //more menu methods in the future.
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("Login");
        System.out.println("createUser");
        System.out.println("deleteUser");
        System.out.println("quit");

        String input = sc.nextLine();
        input = input.toLowerCase();
        return input;
    }
}

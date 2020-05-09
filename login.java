package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
    Scanner sc = new Scanner(System.in);
    public void loginUser(ArrayList<String> usernames, ArrayList<String> passwords){
        //right now, this class only has one method. I might want to make more methods
        //in the login class later, like an admin login system, though.
        System.out.println("Enter username");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();

        if (usernames.indexOf(username) != -1 || passwords.indexOf(password) != -1) {
            if (usernames.indexOf(username) == passwords.indexOf(password)) {
                System.out.println("Welcome " + username);
                //add other stuff here if you want to add other features for logged-in users
            }
            else {
                System.out.println("Incorrect credentials");
            }
        } else {
            System.out.println("User does not exist");
        }
    }
}

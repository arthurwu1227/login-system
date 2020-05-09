package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class userCreation {
    private ArrayList<String> usernames;
    private ArrayList<String> passwords;
    Scanner sc = new Scanner(System.in);

    public userCreation(ArrayList<String> usernames, ArrayList<String> passwords) {
        this.usernames = usernames;
        this.passwords = passwords;
    }

    public void createUser(ArrayList<String> usernames) {
        System.out.println("Enter new username");
        String newUsername = sc.nextLine();
        System.out.println("Enter new password");
        String newPassword = sc.nextLine();

        if (usernames.indexOf(newUsername) == -1) {
            System.out.println("Username available, username being added.");
            this.usernames.add(newUsername);
            this.passwords.add(newPassword);
        } else {
            System.out.println("Username already in use.");
        }

    }

    public ArrayList<String> getUsernames() {
        return usernames;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }


}

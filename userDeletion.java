package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class userDeletion {
    private ArrayList<String> usernames;
    private ArrayList<String> passwords;
    Scanner sc = new Scanner(System.in);

    public userDeletion(ArrayList<String> usernames, ArrayList<String> passwords) {
        this.usernames = usernames;
        this.passwords = passwords;
    }

    public void deleteUser(ArrayList<String> usernames, ArrayList<String> passwords){
        System.out.println("Enter username");
        String deleteUsername = sc.nextLine();
        System.out.println("Enter password");
        String deletePassword = sc.nextLine();

        if (usernames.indexOf(deleteUsername) != -1) {
            if(usernames.indexOf(deleteUsername) == passwords.indexOf((deletePassword))) {
                System.out.println("Are you sure you want to delete user " + deleteUsername + "? enter yes to confirm");

                if (sc.nextLine().toLowerCase().equals("yes")) {
                    System.out.println(deleteUsername + " has been removed.");
                    this.usernames.remove(deleteUsername);
                    this.passwords.remove(deletePassword);
                } else {
                    System.out.println("Username will not be deleted.");
                }
            }
            else {
                System.out.println("Credentials are incorrect");
            }
        }
        else {
            System.out.println("Username or password not found");
        }
    }

    public ArrayList<String> getUsernames(){
        return usernames;
    }

    public ArrayList<String> getPasswords(){
        return passwords;
    }
}

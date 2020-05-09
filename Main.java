package com.company;

import java.util.ArrayList;

public class Main {
    //ideas:
    //add a user edit system where people can edit their username and password
    //add gui once I have the skills to implement it
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        login login = new login();
        userCreation settings = new userCreation(usernames, passwords);
        userDeletion deleteSettings = new userDeletion(usernames, passwords);
        menu menu = new menu();

        while (true) {

            String input = menu.callMenu();

            if(input.equals("quit")){
                System.out.println("Program quitting...");
                break;
            }

            switch (input) {
                case "login":
                    login.loginUser(usernames, passwords);
                    break;
                case "createuser":
                    settings.createUser(usernames);
                    usernames = settings.getUsernames();
                    passwords = settings.getPasswords();
                    break;
                case "deleteuser":
                    deleteSettings.deleteUser(usernames, passwords);
                    usernames = deleteSettings.getUsernames();
                    passwords = deleteSettings.getPasswords();
                    break;
            }
        }
    }
}

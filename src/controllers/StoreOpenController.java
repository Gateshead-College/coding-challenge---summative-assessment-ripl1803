package controllers;

import models.User;

import java.util.Scanner;

public class StoreOpenController {

    private String username = " ";
    private String password = " ";

    public void getUsername(){
        username = new Scanner(System.in).nextLine();
    }

    public void getPassword(){
        password = new Scanner(System.in).nextLine();
    }

    public boolean checkDetails(){
        for(User u : Startup.users){
            if(u.getUsername().equalsIgnoreCase(username)&&u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public void LoadMainMenu(){
        MainMenuController mmc = new MainMenuController();
        mmc.displayMenu();
    }
}

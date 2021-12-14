package controllers;

import models.User;
import views.StoreWelcome;
import java.util.ArrayList;

public class Startup {

    public static ArrayList<User> users;

    public static void main(String[] args) {
        Startup s = new Startup();
        s.createUser();
    }

    private void createUser(){
        users = new ArrayList<>();
        users.add(new User("charlotte", "Ripley", "ripl1803", "pass123"));
        users.add(new User("Gayle", "Proudlock", "plock1068", "pass456"));
        users.add(new User("Donny", "Donaldson", "donald1709", "pass789"));
        users.add(new User("Luke", "Young", "yung2412", "123pass"));
        users.add(new User("Linda", "Cummings", "cmig0950", "456pass"));
        StoreWelcome sw = new StoreWelcome();
        sw.displayStoreOpen();
    }
}

package views;

import controllers.StoreOpenController;

public class StoreWelcome {

    public void displayStoreOpen(){
        StoreOpenController soc = new StoreOpenController();
        System.out.println("Welcome to Jukebox!");
        System.out.println("Please Login to access the store!");

        System.out.println("Please enter your username: ");
        soc.getUsername();
        System.out.println("Please enter your password");
        soc.getPassword();

        if(soc.checkDetails()){
            System.out.println("Correct details entered!");
            System.out.println("Going to main menu");
            soc.LoadMainMenu();
        }
        else{
            System.out.println("Incorrect details entered");
            System.out.println("Please try again");
            displayStoreOpen();
        }
    }
}

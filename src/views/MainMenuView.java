package views;

import java.util.Scanner;

public class MainMenuView {

    public int displayMenu(){
        System.out.println("Please select an option from the below list: ");
        System.out.println("1 - Select an album");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}

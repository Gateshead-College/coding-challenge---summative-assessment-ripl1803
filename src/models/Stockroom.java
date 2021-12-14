package models;

import java.util.Scanner;

public class Stockroom {

    Scanner scn = new Scanner(System.in);
    Album[] albums = new Album[10];

    public static void main(String[] args) {
        Stockroom str = new Stockroom();
        str.initialise();
    }

    private void initialise(){
        albums[0] = new Album(1, "Gold-Diggers Sound", "Leon Bridges", "11", "2021", "£9.99", true);
        albums[1] = new Album(2, "30", "Adele", "12", "2021", "£11.99", false);
        albums[2] = new Album(3, "I Had The Blues But I Shook Them Loose", "Bombay Bicycle Club", "12", "2009", "£10.99", true);
        albums[3] = new Album(4, "DJ-Kicks [DJ Mix]", "Peggy Gou", "19", "2019", "£8.99",true);
        albums[4] = new Album(5, "Nectar", "Joji", "18", "2020", "£15.00",false);
        albums[5] = new Album(6, "This is All Yours", "Alt-j", "14", "2014","£5.99", true);
        albums[6] = new Album(7, "Dark Eyes", "Half Moon Run", "12", "2012", "£8.50",false);
        albums[7] = new Album(8, "Portals", "Sub Focus", "11", "2020", "£9.50",true);
        albums[8] = new Album(9, "Zipper Down", "Eagles Of Death Metal", "11", "2015","£4.99", true);
        albums[9] = new Album(10, "Hunky Dory", "David Bowie", "11", "1971", "£11.05",true);
    }
}

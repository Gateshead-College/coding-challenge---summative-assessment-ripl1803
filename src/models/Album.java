package models;

public class Album {

    public int albumID;
    public String albumTitle;
    public String albumArtist;
    public String numberOfTracks;
    public String albumYear;
    public String price;
    public boolean inStock;


    public Album(int albumID, String albumTitle, String albumArtist, String numberOfTracks, String albumYear, String price, boolean inStock) {
        this.albumID = albumID;
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.numberOfTracks = numberOfTracks;
        this.albumYear = albumYear;
        this.price = price;
        this.inStock = inStock;
    }
}

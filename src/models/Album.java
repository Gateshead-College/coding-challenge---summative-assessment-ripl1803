package models;

public class Album {

    public int albumID;
    public String albumTitle;
    public String albumArtist;
    public int numberOfTracks;
    public String albumYear;

    public Album(int albumID, String albumTitle, String albumArtist, String numberOfTracks, String albumYear) {
        this.albumID = albumID;
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.numberOfTracks = numberOfTracks;
        this.albumYear = albumYear;
    }
}

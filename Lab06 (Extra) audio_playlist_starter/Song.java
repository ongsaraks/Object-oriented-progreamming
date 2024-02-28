/**
 * Modify this class to make it extends Audio class
 * Also, //comment// any unnecessary attributes and methods to avoid shadow attributes (do not remove them, just comment them out)
 * Note that you cannot add a new method in this class
 * @author MUICT
 *
 */

// File: <FILE NAME>
// Description: <DESCRIPTION>
// Lab: <LAB NUMBER e.g., 1, or 2>
//
// ID: <YOUR STUDENT ID>
// Name: <YOUR FULLNAME>
// Section: <YOUR SECTION e.g., 1, 2, or 3>
//
// On my honor, <YOUR FULLNAME>, this project assignment is my own work
// and I have not provided this code to any other students.


public class Song {
	
	private String title;		// song's title	
	private double duration;	// song's duration in minute e.g., 3.14 = 3 minutes and 14 seconds
	private String album;		// song's album
	
	public Song(String t, double d, String a) {
		this.title = t;
		this.duration = d;
		this.album = a;
	}
	
	// getTitle() to get song's title
	public String getTitle() {
		System.out.println("INSDIE SONG CLASS");
		return this.title;
	}
	
	// getDuration() to get song's duration
	public double getDuration() {
		System.out.println("INSDIE SONG CLASS");
		return this.duration;
	}
	
	// getDuration() to get song's duration
	public String getAlbum() {
		System.out.println("INSDIE SONG CLASS");
		return this.album;
	}
	
	// getDuration in second
	public int getDurationSec() {
		System.out.println("INSDIE SONG CLASS");
		return (int) (((int) duration * 60) + ((duration * 100) % 100));
	}

	
	// toString() method to return value of this song
	public String toString() {
		return this.getClass().toString() + "->" + this.title + " | " + this.album + " (" + String.format("%.2f", this.duration) +")";
	}
	
	
}

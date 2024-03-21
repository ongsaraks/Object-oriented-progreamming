
// File: <Ongsa>
// Description: <Generic type of array>
// Lab: <9>
//
// ID: <6688093>
// Name: <Ongsa Raksalam>
// Section: 2
//
// On my honor, <Ongsa raksalam>, this project assignment is my own work
// and I have not provided this code to any other students.

public class Song1 extends Audio implements Comparable<Song1>{
	
	private String title;		// song's title	
	private double duration;	// song's duration in minute e.g., 3.14 = 3 minutes and 14 seconds
	private String album;		// song's album
	
	public Song1(String t, double d, String a) {
	
		super(t,d);
		this.title = t;
		this.duration = d;
		this.album = a;
	}
	
	// getTitle() to get song's title
	public String getTitle() {
//		System.out.println("INSDIE SONG CLASS");
		return super.title;
	}
	public void setTitle() {
//		System.out.println("INSDIE SONG CLASS");
		this.title = super.title;
	}
	public void setDuration() {
//		System.out.println("INSDIE SONG CLASS");
		this.duration = super.duration;
	}
	// getDuration() to get song's duration
	public double getDuration() {
//		System.out.println("INSDIE SONG CLASS");
		return super.duration;
	}
	
	// getDuration() to get song's duration
	public String getAlbum() {
//		System.out.println("INSDIE SONG CLASS");
		return this.album;
	}
	
	// getDuration in second
	public int getDurationSec() {
//		System.out.println("INSDIE SONG CLASS");
		return (int) (((int) duration * 60) + ((duration * 100) % 100));
	}

	
	// toString() method to return value of this song
	public String toString() {
		return super.title;
	}

	@Override
	public int compareTo(Song1 o) {
		// TODO Auto-generated method stub
		if(this.duration > o.getDuration()) {
			return 1;
		}
		else if(this.duration < o.getDuration()) {
			return -1;
				
		}
			return 0;
		
	}
	
	
}

import java.util.*;
public class Playlist {
	private String playlistName;
	private ArrayList<Song> songs;
	
	public Playlist(String N){
	 playlistName = N;	
	 this.songs = new ArrayList<Song>();
	
	}
	public boolean addSong(Song song) {
		 if (!songs.contains(song)) {
			 	songs.add(song);
	            return true;
	      }
		 else{
	            return false;
	      }
		 
		
	}
	public boolean addSongAtIndex(Song song, int index) {
		 if (!songs.contains(song)) {
			 	songs.add(index,song);
	            return true;
	      }
		 else{
	            return false ;
	      }
	}
	public boolean removeSongByIndex(int index) {
		 
	}
	publicSong removeSongByTitle(String title) {
		 
	}
	public double getPlaylistDuration() {
		
	}
	public ArrayList<Song> getTooLongSongs (double minute){
	
	}
	public void showPlaylist() {
		System.out.println(playlistName);
		int j = 0;
		for(Song i:songs) {	
			System.out.printf("[%d]" + i+"\n",j);
			j++;
		}
}
}
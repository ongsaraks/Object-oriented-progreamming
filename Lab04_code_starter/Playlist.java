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
	boolean addSongAtIndex(Song song, int index) {
		 if (!songs.contains(song)) {
			 	songs.add(index,song);
	            return true;
	      }
		 else{
	            return false;
	      }
	}
//	boolean removeSongByIndex(int index) {
//		 
//	}
//	Song removeSongByTitle(String title) {
//		 
//	}
//	double getPlaylistDuration() {
//		
//	}
//	ArrayList<Song> getTooLongSongs (double minute){
//	
//	}
	void showPlaylist() {
		System.out.println(playlistName);
		int j = 0;
		for(Song i:songs) {	
			System.out.printf("[%d]" + i+"\n",j);
			j++;
		}
}
}
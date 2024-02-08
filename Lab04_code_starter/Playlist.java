import java.util.*;
public class Playlist {
	String playlistName;
	ArrayList<Song> songs;
	public Playlist(String N){
	 playlistName = N;	
	 this.songs = new ArrayList<Song>();
	
	}
	public boolean addSong(Song song) {
		for(int i = 0;i < songs.size();i++) {
			if (songs.get(i).getTitle()== song.getTitle()) {
				System.out.println(songs.get(i).getTitle()+" already in the playlist. ");				
				return false;
			} 
			
			}
		songs.add(song);
		return true;
		}

	boolean addSongAtIndex(Song song, int index) {
		if(index < 0 || index > songs.size()) {
			System.out.println("Invalid index");
			return false;
		}
		if (!songs.contains(song)){
			songs.add(index,song);
			return true;
		}
			return false;
		
	}
	boolean removeSongByIndex(int index) {
		 if(index < 0 || index > songs.size()-1) {
				System.out.println("Invalid index");
				return false;
			}
		 else {
			 songs.remove(index);
			 return true;
		 }
	}
    public Song removeSongByTitle(String title) {
    		int check = 0;   
		
		for(int i = 0; i <  songs.size();i++) {
        	   if(title == songs.get(i).getTitle()) {
        		   songs.remove(i);
        		   check++;
        		   break;
        	   }  
           }
		if(check == 0){
           System.out.println("Not found.");
		}
		return null;
//    	int check = 0;
//    	for(int i = 0; i < songs.size();i++) {
//    		if(title == songs.get(i).getTitle()) {
//    			songs.remove(i);
//    			check++;
//    	    }
//    	}
//    	if (check == 0) {
//    		System.out.println("Not Found.");
//    	}
//		return null;  	
    }

    
    public double getPlaylistDuration() {
    	double sum = 0;
    	for(int i = 0; i < songs.size();i++) {
    		sum += songs.get(i).getDuration() + songs.get(i).getDurationSec();
    	}
    	return sum;
    }

//    public ArrayList<Song> getTooLongSongs(double minute) {
//
//    }

	public void showPlaylist() {
		System.out.println(playlistName);
		int j = 0;
		for(Song i:songs) {
			System.out.printf("[%d]" + i +"\n",j);
			j++;
		
		}
		}
		
		
				
		}
		
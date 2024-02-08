import java.util.*;
public class Playlist {
	private String playlistName;
	private ArrayList<Song> songs;
	
	public Playlist(String N){
	 playlistName = N;	
	 this.songs = new ArrayList<Song>();
	
	}
	public boolean addSong(Song song) {
			if(!songs.contains(song)) {
				songs.add(song);
				return true;
			}
			else {
				System.out.println(song.getTitle() + " Already in the playlist"); 
				return false;
			}
		
//		if(!songs.contains(song)) {
//				songs.add(new Song(song.getTitle(),song.getDuration()));
//				return true;
//			}
//			else {
//				System.out.println(song.getTitle() + " Already in the playlist"); 
//				return false;
//			}
		}

//	public boolean addSongAtIndex(Song song, int index) {
//		if(index < 0 || index > songs.size()) {
//			System.out.println("Invalid index");
//		}
//		if (!songs.contains(song)) {
//				songs.add(index,song);
//	            return true;
//		 }
//		 else{
//			 	System.out.println(song.getTitle() + "already in the playlist. ");
//			 	return false;
//	      }
//	
//	}
//	public boolean removeSongByIndex(int index) {
//		 if(index < 0 || index > songs.size()) {
//				System.out.println("Invalid index");
//				return false;
//			}
//		 else {
//			 songs.remove(index);
//			 return true;
//		 }
//	}
//    Song removeSongByTitle(String title) {
//        for (int i = 0; i < songs.size(); i++) {
//            if (songs.get(i).getTitle().equals(title)) {
//                return songs.remove(i);
//            }
//        }
//        System.out.println("Remove not found song: Not found.");
//        return null;
//    }
//    public double getPlaylistDuration() {
//
//    }
//
//    public ArrayList<Song> getTooLongSongs(double minute) {
//
//    }

	public void showPlaylist() {
		System.out.println(playlistName);
		int j = 0;
		for(Song i:songs) {	
			System.out.printf("[%d]" + i+"\n",j);
			j++;
		}
}
}
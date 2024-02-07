public class Playlist {
	private String playlistName;
	private Array<Song>songs;
	
	public Playlist(String N){
	 playlistName = N;
	 Arr	
		
	}
<<<<<<< HEAD
	public boolean addSong(Song song) {
//	    songs.add(song);
//        return true;
		 if (!songs.contains(song)) {
	            songs.add(song);
	            return true;
	        } else {
	            System.out.println("Add duplicate song: " + song.getTitle() + " already in the playlist.");
	            return false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	      }
		 
		
	}
	public void addSongAtIndex(Song song, int index) {
		 if (!songs.contains(song)) {
			 songs.add(index,song);
	        
	      }
		 else if(songs.contains(song)){
			 System.out.println("Perfect" + "already in the playlist");
	      }
		 
=======
	        }
>>>>>>> parent of cc7df69 (add song at index)
=======
	        }
>>>>>>> parent of cc7df69 (add song at index)
=======
	        }
>>>>>>> parent of cc7df69 (add song at index)
	}
//	boolean addSongAtIndex(Song song, int index) {
//		
//	}
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
		for(Song i:songs) {
			System.out.println(i);
		}
}
}
	
=======
>>>>>>> parent of 0207847 (add song)
	
}


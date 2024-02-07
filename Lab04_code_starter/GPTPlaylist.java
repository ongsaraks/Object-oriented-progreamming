import java.util.ArrayList;

public class GPTPlaylist {
    private String playlistName;
    private ArrayList<Song> songs;

    public GPTPlaylist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(Song song) {
        if (!songs.contains(song)) {
            songs.add(song);
            return true;
        } else {
            System.out.println("Add duplicate song: " + song.getTitle() + " already in the playlist.");
            return false;
        }
    }

    public boolean addSongAtIndex(Song song, int index) {
        if (index < 0 || index > songs.size()) {
            System.out.println("Add song at invalid index (at most index now is " + (songs.size() - 1) + "): Invalid Index");
            return false;
        }
        if (!songs.contains(song)) {
            songs.add(index, song);
            return true;
        } else {
            System.out.println("Add duplicate song: " + song.getTitle() + " already in the playlist.");
            return false;
        }
    }

    public boolean removeSongByIndex(int index) {
        if (index < 0 || index >= songs.size()) {
            System.out.println("Remove song at invalid index: Invalid Index");
            return false;
        }
        songs.remove(index);
        return true;
    }

    public Song removeSongByTitle(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.remove(i);
            }
        }
        System.out.println("Remove not found song: Not found.");
        return null;
    }

    public double getPlaylistDuration() {
        double totalDuration = 0;
        for (Song song : songs) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }

    public ArrayList<Song> getTooLongSongs(double minute) {
        ArrayList<Song> tooLongSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getDuration() > minute) {
                tooLongSongs.add(song);
            }
        }
        return tooLongSongs;
    }

    public void showPlaylist() {
        System.out.println(playlistName);
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("[" + i + "] " + songs.get(i));
        }
    }

    // Bonus Methods
    public void moveUp(int position) {
        if (position > 0 && position < songs.size()) {
            Song temp = songs.get(position);
            songs.set(position, songs.get(position - 1));
            songs.set(position - 1, temp);
        }
    }

    public void moveDown(int position) {
        if (position >= 0 && position < songs.size() - 1) {
            Song temp = songs.get(position);
            songs.set(position, songs.get(position + 1));
            songs.set(position + 1, temp);
        }
    }
}

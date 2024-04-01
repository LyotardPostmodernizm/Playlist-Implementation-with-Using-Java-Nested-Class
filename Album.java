import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    
    private String name;
    private String artist;
    private SongList songs;
    
    
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
        
    }
 
   public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }
 

 
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        
        Song asong = songs.findSong(trackNumber);
        if (asong != null) {
            playList.add(asong);
            return true;
        }
        
        return false;
    }
    
 
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        
        Song asong = songs.findSong(title);
        if (asong != null) {
            playList.add(asong);
            return true;
        }
        return false;
    }
    
    public static class SongList{
        private ArrayList<Song>songs;
        
        private SongList(){
            songs = new ArrayList<>();
        }
        
        private boolean add(Song asong){
            if(songs.contains(asong)) return false;
            else songs.add(asong);
            return true;
        }
        
        
        private Song findSong(String title) {
            for (Song asong : songs) {
                if (asong.getTitle().equals(title)) {
                    return asong;
                }
            }
            return null;
        }
        
         private Song findSong(int trackNumber) {
            
            int index = trackNumber - 1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    
    
    }
}

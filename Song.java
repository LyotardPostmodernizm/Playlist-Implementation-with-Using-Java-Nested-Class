public class Song {
    // write code here
    private String title;
    private double duration;
    
    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }
    
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return String.format("%s : %f",title,duration);
    }
    
}

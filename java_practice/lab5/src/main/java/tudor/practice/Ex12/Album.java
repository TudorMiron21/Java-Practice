package tudor.practice.Ex12;
import java.util.*;
import java.util.stream.Stream;
public class Album {
    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians){
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    public String getName(){return this.name;}
    public Stream<Track> getTracks(){return this.tracks.stream();}
    public Stream<Artist> getArtist(){return this.musicians.stream();}

    public void setName(String name){this.name = name;}

    


}

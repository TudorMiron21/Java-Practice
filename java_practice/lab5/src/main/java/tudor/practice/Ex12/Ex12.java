package tudor.practice.Ex12;

import tudor.practice.Ex;
import java.util.*;
public class Ex12 implements Ex {

    @Override
    public void test(){

        List<Track> tracks = Arrays.asList(new Track("melodia mea"),
        new Track("song 1"), 
        new Track("album song"),
        new Track("beton song"));

        List<Artist> artists = Arrays.asList(new Artist("mihai", "romanian"),
        new Artist("Andrew", "American"),
        new Artist("Mircea", "turkish"),
        new Artist("Doarian", "Romanian"));
        Album album = new Album("Album misto", tracks, artists);

        //lista in majuscule a cantecelor
        album.getTracks().map((Track t)-> t.getName().toUpperCase()).forEach(System.out::println);
        System.out.println(album.getTracks().count());


        //lista artistilor sortati dupa nume
        album.getArtist().sorted(Comparator.comparing(Artist::getName)).forEach(System.out::println);


    }

    
}

package tudor.practice.Ex12;

public class Artist {
    
    private String name;
    private String nationality;

    public Artist(String name,String nationality)
    {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName(){return  name;}
    public void setName(String name){this.name= name;}

    public String getNationality(){return nationality;}
    public void setNationality(String national){this.nationality= national;}

    @Override
    public String toString(){
        return "this is an artist:" + this.name + " " +this.nationality;
    }
}

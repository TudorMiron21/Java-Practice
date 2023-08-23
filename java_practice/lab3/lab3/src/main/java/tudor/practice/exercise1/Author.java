package tudor.practice.exercise1;

public class Author {
    private String Name;
    private String Email;
    private char Gender;

    public Author(String Name, String Email,char Gender){
        this.Name = Name;
        this.Email = Email;
        this.Gender = Gender;
    }

    public String getName(){ return this.Name;}
    public String getEmail(){ return this.Email;}
    public char getGender(){ return this.Gender;}


    public void setName(String Name){this.Name = Name;}
    public void setEmail(String Email){this.Email = Email;}
    public void setGender(char Gender){this.Gender = Gender;}

    @Override
    public String toString(){
        return "this is an Author with email, " + this.Email +"name, " + this.Name +" and gender " + this.Gender;
    }


}

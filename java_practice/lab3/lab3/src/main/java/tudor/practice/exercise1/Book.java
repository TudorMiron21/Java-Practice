package tudor.practice.exercise1;

public class Book {
    

    private String Name;
    private Author Author;
    private Double Price;
    private Integer qty;
    
    public Book(String Name,Author Author,double Price,Integer qty){
        this.Name = Name;
        this.Author = Author;
        this.Price = Price;
        this.qty = qty;
    }

    public String getName(){ return this.Name;}
    public Author getAuthor(){ return this.Author;}
    public Double getPrice(){ return this.Price;}
    public Integer getQty(){ return this.qty;}

    public void setName(String Name){this.Name = Name;}
    public void setAuthor(Author Author){this.Author = Author;}
    public void setPrice(Double Price){this.Price = Price;}
    public void setQty(Integer qty){this.qty = qty;}

    @Override
    public String toString(){
        return "this is a book with the author (" + this.Author.toString() + ")";
    }

}

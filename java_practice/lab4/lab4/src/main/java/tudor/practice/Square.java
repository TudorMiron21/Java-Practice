package tudor.practice;

public class Square {
    
    private Double side;
    private String color; 

    public Square(){}

    public Square(Double side){
        this.side =side;
    }

    public Square(String color,Double side){

        this.color = color;
        this.side =side;
    }

    public Double getSide(){return this.side;}

    public void setSide( Double side) { this.side = side;}

    public String getColor(){return this.color;}

    public void setColor(String color) { this.color = color;}

    public Double getArea()
    {
        return this.side * this.side;
    }

    public Double getPerimeter(){
        return 2 * side + 2 * side;
    }

    @Override
    public String toString(){
        
        return this.color + this.getArea(); 
    }
}


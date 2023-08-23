package tudor.practice.exercise3;

public class Square extends Rectangle {
    
    private Double side;

    public Square(){}

    public Square(Double side){

        this.side =side;
    }

    
    public Square(String color,Boolean filled,Double side){

        this.color = color;
        this.filled = filled;
        this.side =side;
    }

    public Double getSquare(){return this.side;}

    public void setSquare( Double side) { this.side = side;}

    @Override
    public Double getArea()
    {
        return this.side * this.side;
    }

    @Override
    public Double getPerimeter(){
        return 2 * side + 2 * side;
    }

    @Override
    public String toString(){
        return this.color + this.getArea();
    }
}

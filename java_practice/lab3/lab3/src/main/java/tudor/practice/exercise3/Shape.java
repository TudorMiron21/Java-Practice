package tudor.practice.exercise3;


abstract class Shape {
    protected String color;
    protected Boolean filled;


    public Shape(){}

    public Shape(String color,Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){return this.color;}
    public Boolean isFilled(){return this.filled;}

    public void setColor(String color){this.color = color;}
    public void setFilled(Boolean filled){this.filled = filled;}

    abstract Double getArea();
    abstract Double getPerimeter();

    @Override
    public String toString(){
        return "shape [" + this.color +","+ this.filled+"]"; 
    }

}

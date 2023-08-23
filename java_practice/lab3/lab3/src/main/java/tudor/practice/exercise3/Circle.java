package tudor.practice.exercise3;

import java.lang.Math;
public class Circle extends Shape{
    

    private Double Radius;
    public Circle(){}

    public Circle(double Radius){
        this.Radius = Radius;
    }

    public Circle(String color, Boolean filled, Double Radius)  
    {
        super(color, filled);
        this.Radius = Radius;
    }

    public Double getRadius(){return this.Radius;}

    public void setRadius( Double Radius) { this.Radius = Radius;}

    @Override
    public Double getArea()
    {
        return Math.PI * Radius * Radius;
    }

    @Override
    public Double getPerimeter(){
        return Math.PI * Radius * 2;
    }

    @Override
    public String toString(){
        return "";
    }
}

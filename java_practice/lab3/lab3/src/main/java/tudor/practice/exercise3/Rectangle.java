package tudor.practice.exercise3;

public class Rectangle extends Shape{
    

    private Double width;
    private Double length;

    public Rectangle(){}
    public Rectangle(Double width, Double length){

        this.length = length;
        this.width = width;
    }

        public Rectangle(String color,Boolean filled, Double width, Double length){
        super(color,filled);
        this.length = length;
        this.width = width;
    }

    public Double getWidth(){return this.width;}

    public void setWidth( Double width) { this.width = width;}

    public Double getLength(){return this.length;}

    public void setLength( Double length) { this.length = length;}

    @Override
    public Double getArea()
    {
        return this.width * this.length;
    }

    @Override
    public Double getPerimeter(){
        return 2 * length + 2 * width;
    }

    @Override
    public String toString(){
        return "";
    }


}


package jackson;

public class Circle {
    private int radius;
    private String color;

    // Constructor implicit
    public Circle() {
        radius = 1; // Valoarea implicită a razelor
        color = "red"; // Valoarea implicită a culorii
    }

    // Constructor cu parametri
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter pentru radius
    public int getRadius() {
        return radius;
    }

    // Setter pentru radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter pentru color
    public String getColor() {
        return color;
    }

    // Setter pentru color
    public void setColor(String color) {
        this.color = color;
    }

    // Metoda toString pentru afișarea informațiilor despre cerc
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}

package tudor.practice.Ex1;
import java.util.*;
public class Dish {
    private String name;
    private Boolean vegetarian;
    private Integer calories;
    private DishType type;

    public Dish(String name,Boolean vegetarian,Integer calories,DishType type){

        this.type = type;
        this.calories = calories;
        this.name = name;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Integer getCalories() {
        return calories;
    }

    public DishType getType() {
        return type;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
               "name='" + name + '\'' +
               ", vegetarian=" + vegetarian +
               ", calories=" + calories +
               ", type=" + type +
               '}';
    }

    public static List<Dish> getDishes(){
        List<Dish> dishes = new ArrayList<>();
        Dish pork = new Dish("pork", false, 800, DishType.MEAT);
        Dish beef = new Dish("beef", false, 700,DishType.MEAT);
        Dish chicken = new Dish("chicken", false, 400, DishType.MEAT);
        Dish frenchFries = new Dish("french fries", true, 530, DishType.OTHER);
        Dish rice = new Dish("rice", true, 350,DishType.OTHER);
        Dish seasonalFruit = new Dish("seasonal fruit", true, 120, DishType.OTHER);
        Dish pizza = new Dish("pizza", true, 550, DishType.OTHER);
        Dish prawns = new Dish("prawns", false, 400, DishType.FISH);
        Dish salmon = new Dish("salmon", false, 450, DishType.FISH);

        dishes.add(pork);
        dishes.add(beef);
        dishes.add(chicken);
        dishes.add(frenchFries);
        dishes.add(rice);
        dishes.add(seasonalFruit);
        dishes.add(pizza);
        dishes.add(prawns);
        dishes.add(salmon);
        return dishes;
    }
}

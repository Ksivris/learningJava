import java.util.List;

public class Dog extends Animal {
    private String breed;
    private String color;
    private double weight;

    Dog(String name,int age,String breed,String color, double weight) {
        super (name,age);
        this.breed = breed;
        this.color = color;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Name: " + getName() + " Breed: " + getBreed() + " Age: " + getAge() + " Weight: " + getWeight();
    }

    public  void print(){
        System.out.println(toString());
    }

    public static final List<String> BREEDS = List.of(
            "doberman","husky", "coley","pyrenees"
    );


}


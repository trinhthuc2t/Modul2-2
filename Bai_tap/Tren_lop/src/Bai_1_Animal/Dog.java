package Animal;

public class Dog extends Animal{
    private String color;
    private String dogs;
    public Dog (){

    }



    public Dog(int id, String name, String date, String color, String dogs) {
        super(id, name, date);
        this.color = color;
        this.dogs = dogs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDogs() {
        return dogs;
    }

    public void setDogs(String dogs) {
        this.dogs = dogs;
    }
    public void makeSound (){
        System.out.println(getName() + "speak go go");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", dogs='" + dogs + '\'' +
                ", countAnimal=" + countAnimal +
                '}';
    }
}

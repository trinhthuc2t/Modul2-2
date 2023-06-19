package Animal;

public class Animal {
    private int id;
    private String name;
    private String date;
    static int count;
    public int countAnimal;
    public Animal(){

    }

    public Animal(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
       this.countAnimal = count++;
    }

//    public static boolean checkCat() {
//        if ()
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void makeSound(){
        System.out.println(name + " is make sound");
    }

}

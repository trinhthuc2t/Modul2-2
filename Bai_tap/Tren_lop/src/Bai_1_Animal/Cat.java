package Animal;

public class Cat extends Animal {
    private String eyeColor;
    private String cats;
    private boolean health;

    public Cat() {

    }

    public Cat(String eyeColor, String cats, boolean health) {
        this.eyeColor = eyeColor;
        this.cats = cats;
        this.health = health;
    }

    public Cat(int id, String name, String date, String eyeColor, String cats, boolean health) {
        super(id, name, date);
        this.eyeColor = eyeColor;
        this.cats = cats;
        this.health = health;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getCats() {
        return cats;
    }

    public void setCats(String cats) {
        this.cats = cats;
    }

    public boolean getHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public void makeSound() {
        System.out.println(getName() + "speak moe moe");
    }
    public void thuocBo (String a){
        System.out.println("uống thuôc bổ ");
    }
    public void thuocChua(String b){
        System.out.println("uống thuôc");
    }
    public void sucKhoe() {
        if (health) {
            thuocBo("1");
        } else {
            thuocChua("1");
        }
    }
}

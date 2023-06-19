package Animal;

public class Bird extends Animal{
   private String beak;
   private boolean fly;
   public Bird(){

   }
   public Bird(String beak, boolean fly) {
      this.beak = beak;
      this.fly = fly;
   }

   public Bird(int id, String name, String date, String beak, boolean fly) {
      super(id, name, date);
      this.beak = beak;
      this.fly = fly;
   }

   public String getBeak() {
      return beak;
   }

   public void setBeak(String beak) {
      this.beak = beak;
   }

   public boolean isFly() {
      return fly;
   }

   public void setFly(boolean fly) {
      this.fly = fly;
   }
   public void makeSound(){
      System.out.println(getName() + " Speak líu lo");
   }
}

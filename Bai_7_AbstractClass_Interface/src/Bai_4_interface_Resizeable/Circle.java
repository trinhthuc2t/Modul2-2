package Bai_3_interface_Resizeable;

public class Circle implements Resizeable{
        private double radius;
        public Circle(double radius) {
            this.radius =radius;
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
public double getAreaCir(){
    return Math.PI * radius * radius;
}
    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
}

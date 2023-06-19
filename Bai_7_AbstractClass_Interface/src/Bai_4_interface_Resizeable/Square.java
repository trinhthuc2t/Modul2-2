package Bai_3_interface_Resizeable;

public class Square implements Resizeable {

    private double side;
    public Square (double side) {
        this.side = side;
    }
    public double getSide (){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }
    public double getAreaSquare(){
        return side*side;
    }
}

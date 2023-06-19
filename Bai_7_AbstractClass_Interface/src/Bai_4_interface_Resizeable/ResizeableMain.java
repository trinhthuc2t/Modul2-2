package Bai_3_interface_Resizeable;

public class ResizeableMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(7,9);
        Square square = new Square(6);

        System.out.println("Before resizing:");
        System.out.println("Circle area: " + circle.getAreaCir());
        System.out.println("Rectangle area: " + rectangle.getAreaRec());
        System.out.println("Square area: " + square.getAreaSquare());


        double percent = 50; // Tỉ lệ tăng kích thước là 50%
        System.out.println("==================================");
        circle.resize(percent);
        rectangle.resize(percent);
        square.resize(percent);

        System.out.println("\nAfter resizing:");
        System.out.println("Circle area: " + circle.getAreaCir());
        System.out.println("Rectangle area: " + rectangle.getAreaRec());
        System.out.println("Square area: " + square.getAreaSquare());
    }
}

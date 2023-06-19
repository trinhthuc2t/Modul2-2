package Hoc_Generic.Main;

public class TestBox2 {
    public static void main(String[] args) {
        Box2 box2 = new Box2<Integer>(15);
        Box2 box21 = new Box2<String>("Mười lăm");

        System.out.println(box21.getValue());
        System.out.println(box2.getValue());

    }
}

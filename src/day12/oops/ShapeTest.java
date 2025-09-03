package day12.oops;

public class ShapeTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.draw();

        Shape shape;

        shape = new Rectangle();
        shape.draw();

        shape = new Triangle();
        shape.draw();
    }
}

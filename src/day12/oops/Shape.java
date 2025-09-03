package day12.oops;

public /*final*/ abstract class Shape {

    //final, static, private
    public abstract void draw();

    public void paint() {
        System.out.println("shape is painted");
    }

    public Shape(){

    }
}

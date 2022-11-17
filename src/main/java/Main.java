import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println("class of Circle: " + shape.getClass());
        System.out.println("class of ArrayList" + ArrayList.class);
    }
}

class Shape {
    public void draw() {
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Draw Triangle");
    }
}
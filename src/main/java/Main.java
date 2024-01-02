package main.java;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();
        Circle circle1 = new Circle();
        Quad quad1 = new Quad();
        Rectangle rectangle1 = new Rectangle();
        Triangle triangle1 = new Triangle();
        Pentagon pentagon1 = new Pentagon();

        printer.printShapeName(circle1);
        printer.printShapeName(quad1);
        printer.printShapeName(rectangle1);
        printer.printShapeName(triangle1);
        printer.printShapeName(pentagon1);
    }
}
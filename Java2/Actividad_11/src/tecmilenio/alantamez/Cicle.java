package tecmilenio.alantamez;

public class Cicle implements Shape {
    public static double PI = 3.141592;
    private double radius;

    public Cicle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  PI* radius *radius;
    }

    @Override
    public double getPerimeter() {
        return PI* radius *2;
    }

}

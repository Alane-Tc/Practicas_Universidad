package tecmilenio.alantamez;

public class Triangle implements Shape {
    private double baseTriangle;
    private double heightTriangle;
    private double perimeterTriangle;

    public Triangle(double baseTriangle, double heightTriangle) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
    }

    @Override
    public double getArea() {
        return (baseTriangle*heightTriangle)/2.0;
    }

    @Override
    public double getPerimeter() {
        return baseTriangle*3;
    }

}

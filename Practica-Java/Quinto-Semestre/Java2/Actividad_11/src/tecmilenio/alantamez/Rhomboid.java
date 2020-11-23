package tecmilenio.alantamez;

public class Rhomboid implements Shape{
    private double rhomboidBase;
    private double heightRhomboid;

    public Rhomboid(double rhomboidBase, double heightRhomboid) {
        this.rhomboidBase = rhomboidBase;
        this.heightRhomboid = heightRhomboid;
    }

    @Override
    public double getArea() {
        return rhomboidBase * heightRhomboid;
    }

    @Override
    public double getPerimeter() {
        return 2*(rhomboidBase+heightRhomboid);
    }
}

package GraphicEditor;

public class Rhombus extends Shape {

    private double sideLength;
    private double angle;

    public Rhombus(String name, double sideLength, double angle) {
        super(name);
        this.sideLength = sideLength;
        this.angle = angle;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getAngle() {
        return angle;
    }
}

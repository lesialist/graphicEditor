package GraphicEditor;

public class Circle extends Shape{
    private String name;
    private double radius;
    private static final double PI = 3.14159;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}

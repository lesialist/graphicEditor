package GraphicEditor;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;

    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }



}





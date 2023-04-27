package GraphicEditor;

public class Pentagon extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;

    public Pentagon(String name, double sideA, double sideB, double sideC, double sideD, double sideE) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
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

    public double getSideD() {
        return sideD;
    }

    public double getSideE() {
        return sideE;
    }
}

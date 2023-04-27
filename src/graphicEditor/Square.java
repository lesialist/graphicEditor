package GraphicEditor;

public class Square extends Shape{
    public double getSide() {
        return side;
    }

    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }


}

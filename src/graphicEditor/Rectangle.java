package graphicEditor;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }



    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }


}

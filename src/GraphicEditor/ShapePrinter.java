package GraphicEditor;

public class ShapePrinter {
    public void printShapeName(Shape shape) {

        System.out.println("This is a " + shape.getName());
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println("radius: " + circle.getRadius());
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("height: " + rectangle.getHeight()+", width: " + rectangle.getWidth());}
            else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("side length: " + square.getSide());
        } else if (shape instanceof Rhombus) {
            Rhombus romb = (Rhombus) shape;
            System.out.println("side length: " + romb.getSideLength()+ ", angle: " +romb.getAngle());
        }
        else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.println("side a: " + triangle.getSideA()+", side b: "+triangle.getSideB()+ ", side c: "+triangle.getSideC());
        }
        else if (shape instanceof Pentagon) {
            Pentagon pentagon = (Pentagon) shape;
            System.out.println("side a: " +pentagon.getSideA()+
                    ", side b: "+pentagon.getSideB()+ ", side c: "+pentagon.getSideC()+
                    ", side d: " +pentagon.getSideD()+", side e: "+pentagon.getSideE());
        }


    }

}

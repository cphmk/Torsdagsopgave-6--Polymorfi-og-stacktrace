
public class Main {


    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square.getArea());

        Circle circle = new Circle(8);
        System.out.println(circle.getArea());


        ShapeBuilder shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShape(square);
        shapeBuilder.addShape(circle);

        System.out.println(shapeBuilder.getTotalArea());

    }
}
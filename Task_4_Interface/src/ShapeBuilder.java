// 4.3
// I have created a shape builder class.

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();  // ArrayList for my shapes

    public void addShape(Shape s) {    // I have created a method addShape(Shape s)
              this.shapes.add(s);      // To Add new shape objects.
    }
// 4.4   I have created a getTotalArea() method.
    public double getTotalArea() {   // Method to get the total area result, of all the Shape objects.
            double result = 0;
            for(Shape theshape : this.shapes) {
                result += theshape.getArea();
            }
        return result;
    }
}
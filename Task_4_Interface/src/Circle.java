// 4.2
public class Circle implements Shape { // Implemented interface.


    double radius;

      Circle(double radius) {     // A double parameter in the constructor
        this.radius = radius;
      }

      public double getArea() {          // my getArea() method to return area.
        return 3.14 * (radius * radius);
      }
}
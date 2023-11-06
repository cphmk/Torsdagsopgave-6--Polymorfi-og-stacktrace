// 4.2
public class Square implements Shape { // Implemented interface.

    double length;

      Square (double length) {      // A double parameter in the constructor
        this.length = length;
      }

      public double getArea() {    // my getArea() method to return area.
        return length * length;
      }
}
import java.lang.Math;

// Creates a circle class
public class Circle {
//  fields of a circle
    private double radius;
    private double x;
    private double y;

//  get methods
    public double getRadius() {
        return radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

//   set methods
    public void setRadius(double length) {
        radius = length;
    }
    public void setX(double coordinate) {
        x = coordinate;
    }
    public void setY(double coordinate) {
        y = coordinate;
    }

    /**
     * getArea determines the area of a circle
     * @return the area using Math.PI with no rounding.
     */
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * doesOverlap identifies if the current object overlaps with another circle object.
     * Given that these are circles, the method of identifying the overlap is to find the distance between
     * the two center-points and see if the radiuses of the two circles is greater or less than this amount.
     * @param otherCircle the other circle required for comparison
     * @return a boolean indicating if the circles overlap
     */

    public boolean doesOverlap(Circle otherCircle) {
//        Find the distnace between two circles
//        Formula is finding the hypotenuse of the x and y coordinates
//        sqrt((x1-x2)^2+(y1-y2)^2)
        double hypotenuse;
//        set circle1 variables (for clarity)
        double x1 = x;
        double y1 = y;
//        set circle 2 variables (for clarity)
        double x2 = otherCircle.getX();
        double y2 = otherCircle.getY();
//        set sum of radius
        double sumRadius = radius + otherCircle.getRadius();
//        calculate hypotenuse
        hypotenuse = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

//        if condition on if radius>hypotenuse
        if(sumRadius > hypotenuse) {
            return true;
        }
        else {
            return false;
        }

    }
}
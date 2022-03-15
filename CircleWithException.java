import java.util.*;

public class CircleWithException {

    private double radius;

    public CircleWithException(double radius) {
        this.radius = radius;
    }

    // Set radius of circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Get radius of circle
    public double getRadius() {
        return radius;
    }

    // Get area of circle
    public double getArea() {
        return (Math.PI * getRadius() * getRadius());
    }

    // Get diameter of circle
    public double getDiameter() {
        return (getRadius() * 2);
    }

    // Validity Check
    public static void check(double area, double radius) throws Exception, IllegalArgumentException {

        if (radius < 0) {
            throw new IllegalArgumentException("Radius should not be negative");
        }

        if (area > 1000) {
            throw new Exception("Area is more than 1000");
        }

    }

    public static void main(String[] args) {

        try {

            CircleWithException circle;

            Scanner s = new Scanner(System.in);

            System.out.println("Enter a radius: ");
            double radius = s.nextDouble();

            circle = new CircleWithException(radius);

            check(circle.getArea(), radius);

            System.out.println("Radius of circle is: " + circle.getRadius());
            System.out.println("Area of circle is: " + circle.getArea());
            System.out.println("Diameter of circle is: " + circle.getDiameter());

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
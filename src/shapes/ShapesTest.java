/**
 * Credit for missing/edited portions of code goes to Ryan Orsinger (ryanorsinger) on GitHub
 */

package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(12.21, 19.92);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());

        myShape = new Square(66.67);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());
    }
}

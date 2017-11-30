package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}

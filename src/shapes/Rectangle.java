package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

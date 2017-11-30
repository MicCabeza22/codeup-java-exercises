package shapes;

public abstract class Square extends Quadrilateral {
    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
    }
}
package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square(int side) {
        super.setLength(side);
        super.setWidth(side);
        this.side = side;
    }

    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    public int getPerimeter() {
        return side * 4;
    }
}
public class Square extends Shape {
    private double length;

    public Square(double sideLength) {
        length = sideLength;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }
}

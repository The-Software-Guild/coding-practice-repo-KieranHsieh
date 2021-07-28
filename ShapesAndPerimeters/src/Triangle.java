public class Triangle extends Shape {
    private double height;
    private double baseLength;

    public Triangle(double height, double width) {
        this.height = height;
        this.baseLength = width;
    }

    @Override
    public double getArea() {
        return (height * baseLength) / 2;
    }

    @Override
    public double getPerimeter() {
        double hBaseLength = baseLength / 2;
        double sideLength = Math.sqrt((height * height) + (hBaseLength * hBaseLength));
        return (sideLength * 2) + baseLength;
    }
}

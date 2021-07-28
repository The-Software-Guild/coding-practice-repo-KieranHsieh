public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(double width, double height) {
        this.length = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.length * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.height) * 2;
    }
}

package oleg.bryl;

public class Circle extends Form {
    private Point circleCenter;
    private double radius;

    public Circle(Point circleCenter, double radius) throws IllegalArgumentException {
        this.circleCenter = circleCenter;
    }

    public Circle(double x, double y, double radius) {
        checkR(radius);
        this.circleCenter = new Point(x, y);
    }

    private void checkR(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be bigger then 000");
        }
        this.radius = radius;
    }

    @Override
    public double square() {
        return 3.14 * Math.sqrt(radius);
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void moving(double x, double y) {
        circleCenter.setX(circleCenter.getX() + x);
        circleCenter.setY(circleCenter.getY() + y);
    }

    public Point getCircleCenter() {
        return circleCenter;
    }

    public void setCircleCenter(Point circleCenter) {
        this.circleCenter = circleCenter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circleCenter=" + circleCenter +
                ", radius=" + radius +
                '}';
    }
}

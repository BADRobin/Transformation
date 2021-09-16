package oleg.bryl;

public class Circle {
    private Point circleCenter;
    private double radius;

    public Circle(Point circleCenter, double radius) throws IllegalArgumentException {
        this.circleCenter = circleCenter;
    }

    public Circle(double x, double y, double radius) {

    }

    private void checkR(double radius) throws IllegalArgumentException{
        if (radius <=0 ){
            throw new IllegalArgumentException("radius must be bigger then 000");
        }this.radius = radius;
    }
}

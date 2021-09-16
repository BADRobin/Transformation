package oleg.bryl;

public class Rectangle extends Form {
    private Point inUpLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point inUpLeftPoint, Point bottomRightPoint) {
        this.inUpLeftPoint = inUpLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Rectangle(double left, double up, double right, double bottom) {
        this.inUpLeftPoint = new Point(left, up);
        this.bottomRightPoint = new Point(right, bottom);
    }

    @Override
    public double square() {
        return Math.abs((bottomRightPoint.getX() - inUpLeftPoint.getX()) *
                (bottomRightPoint.getY() - inUpLeftPoint.getY()));
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public void moving(double x, double y) {


    }
}
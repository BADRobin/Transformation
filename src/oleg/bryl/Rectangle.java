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
        return 2 * (Math.abs(bottomRightPoint.getX() - inUpLeftPoint.getX()) +
                Math.abs(bottomRightPoint.getY() - inUpLeftPoint.getY()));
    }

    @Override
    public void moving(double x, double y) {
        inUpLeftPoint.setX(inUpLeftPoint.getX() + x);
        inUpLeftPoint.setY(inUpLeftPoint.getY() + x);
        bottomRightPoint.setX(bottomRightPoint.getX());
        bottomRightPoint.setY(bottomRightPoint.getY());
    }

    public Point getInUpLeftPoint() {
        return inUpLeftPoint;
    }

    public void setInUpLeftPoint(Point inUpLeftPoint) {
        this.inUpLeftPoint = inUpLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "inUpLeftPoint=" + inUpLeftPoint +
                ", bottomRightPoint=" + bottomRightPoint +
                super.toString() +
                '}';
    }
}
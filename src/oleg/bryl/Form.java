package oleg.bryl;

public abstract class Form {
    public abstract double square();
    public abstract double perimeter();
    public abstract void moving(double x, double y);



    @Override
    public String toString() {
        return "square = " + square() + ", perimeter" + perimeter();
    }
}

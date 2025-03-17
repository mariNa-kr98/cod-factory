package gr.aueb.cf.ch16.challenge2;

public class Circle extends AbstractShape implements IShape, ITwoDimensional, ICircle {

    private Double radius;

    public Circle() {}

    public Circle(Double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double getDiameter() {
        return 2 * Math.PI * getRadius();
    }
}

package gr.aueb.cf.ch16.challenge2;

public class Line extends AbstractShape implements ILine{

    private double length;

    private Line() {}

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

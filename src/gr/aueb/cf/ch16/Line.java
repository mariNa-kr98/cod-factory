package gr.aueb.cf.ch16;

public class Line extends AbstractShape{

    private double length;

    public Line(){}

    public Line(double length) {
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }
}

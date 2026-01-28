package methods;

public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double len, double bread) {
        this.length = len;
        this.breadth = bread;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("The area of the room is: " + area);
    }
}


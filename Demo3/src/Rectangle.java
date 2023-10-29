public class Rectangle extends Shape{

    private double side1;
    private double side2;

    Rectangle(String g, double x, double y) {
        super(g);
        this.side1=x;
        this.side2=y;
    }
    public double area()
    {
        return side1*side2;
    }
    public double perimeter()
    {
        return (2*side1)+(2*side2);
    }
}

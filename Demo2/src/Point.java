import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    Point()
    {

    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
    {
        this.x= x;
    }
    public void setY(int Y)
    {
        this.y= Y;
    }
    public String toString()
    {
        return("x: "+x+" y: "+y);
    }
    public double distance(Point p)
    {
        return sqrt(pow((this.x+p.x),2)+pow((this.y+p.y),2));
    }
}

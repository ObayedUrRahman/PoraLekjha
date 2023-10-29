import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    private Point start;
    private Point end;
    Line(Point Start, Point End)
    {
        this.start= Start;
        this.end= End;
    }
    Line(int x1,int x2,int x3,int x4)
    {
        this.start.setX(x1);
        this.start.setY(x2);
        this.end.setX(x3);
        this.end.setY(x4);

    }
    public Point getStart()
    {
        return this.start;

    }
    public Point getEnd()
    {
        return this.end;

    }
    public void setStart(Point Start)
    {
        this.start=Start;
    }
    public void setEnd(Point End)
    {
        this.end=End;
    }
    public double length()
    {
        return sqrt(pow((this.end.getX()-this.start.getX()),2)+pow((this.end.getY()-this.start.getY()),2));
    }
}

public class point {
    private int x;
    private int y;


    point(int x , int y ){
        this.x = x;
        this.y = y;
    }

    point(){}

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public String toString() {
        return "x= " + this.x + "y= " + this.y;
    }
    public double distance(point Point){
        double d = Math.sqrt(Math.pow(this.x - Point.getX(), 2) +
                Math.pow(this.y - Point.getY(), 2));
        return d;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Point x= new Point(3,4);
        Point y= new Point(4,5);
        Line l= new Line(x,y);
        System.out.println(l.length());

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        Line b=new Line(3,4,5,6);


    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Method op1 = new Method();
        System.out.println("Please enter your numbers:");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Please enter your operator'* / + or -'");
        String op = sc.next();
        if(op.equals("+"))
        {45
            System.out.println(op1.add(x, y));
        }
        else if (op.equals("-"))
        {
            System.out.println(op1.sub(x , y));
        }
        else if (op.equals("*"))
        {
            System.out.println(op1.mul(x , y));
        }
        else if (op.equals("/"))
        {
            System.out.println(op1.div(x , y));
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        int un;
        //System.out.println("Please enter the number of numbers:");
        //n=sc.nextInt();
        Integer[] w= new Integer[101];
        for(int i=0;i<=100;i++)
        {
            w[i]=(int)(Math.random()*10000);
        }
        System.out.println("Please enter the index you want:");
        un=sc.nextInt();
        try{
            if(un >0 && 100 >= un)
            {
                System.out.println("The number is:"+w[un]);

            }
            else
            {
                throw new Exception();
            }

        }
        catch (Exception e)
        {
            System.out.println("Please enter a number betweeen 1 to 100");
        }

    }
}
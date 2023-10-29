import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=1;
        int sum=0;
        int x=0;
        while(n<=10)
        {
            try{
                x=sc.nextInt();
                if(x>=0)
                {
                   sum=sum+x;
                   n++;
                }
                else
                {
                    throw new RuntimeException();
                }


            }catch(Exception e)
            {
                System.out.println("Please enter a positive integer");
            }

        }
        System.out.println("The sum is"+ sum);

    }
}
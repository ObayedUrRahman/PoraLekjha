import java.io.File;
import java.util.Scanner;

public class errrrrr {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\USER\\Desktop\\Obayed\\mark.txt");
        int ns=0;
        Quiz[] w= new Quiz[10];
        try{
            Scanner sc= new Scanner(f);


            while(sc.hasNext())
            {
                System.out.println("ID:"+sc.nextInt()+" Mark:"+sc.nextInt());

            }

        }catch (Exception e)
        {
            System.out.println("error");
        }
    }
}

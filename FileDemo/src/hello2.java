import java.io.File;
import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Public\\Downloads\\test\\std.txt");
            Scanner sc= new Scanner(f);

            while(sc.hasNext()){

                String id = sc.next();
                String name = sc.next();
                System.out.println(id + "\n"+ name+ "\n");

            }
            sc.close();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

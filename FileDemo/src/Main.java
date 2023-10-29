import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id, name;
        int i;
        Scanner sc = new Scanner(System.in);
        try {
            Formatter formatter = new Formatter("C:\\Users\\Public\\Downloads\\test\\std.txt");


            int n = sc.nextInt();

            for (i=0; i<n; i++){
                System.out.println("Enter name and id");
                id= sc.next();
                name = sc.next();
                formatter.format(id + "\n");
                formatter.format(name + "\n");

            }

            //formatter.format("gjsdhfkghs \n");
            //formatter.format("ksjdfhlksdjghlkdfgh");
            formatter.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

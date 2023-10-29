import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File f= new File("C:\\Users\\USER\\Desktop\\Obayed\\mark.txt");
        int ns=0;
        Quiz[] well = new Quiz[10];
        try{
            Scanner sc= new Scanner(f);


            while(sc.hasNext())
            {
               well[ns]=new Quiz(sc.nextInt(),sc.nextInt());
                ns++;

            }
            sc.close();

        }catch (Exception e)
        {
            System.out.println("error");
        }
        for(int i=0;i<ns;i++)
        {
            System.out.println("ID:"+well[i].getId()+" Mark:"+well[i].getMark());
        }
        int gm=0;
        int gmID=0;
        for(int i=0;i<ns;i++)
        {
            if(well[i].getMark()>gm)
            {
                gm=well[i].getMark();
                gmID=well[i].getId();
            }
        }
        System.out.println("The Heighest mark was obtained by ID:"+gmID);

    }
}
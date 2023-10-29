import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        
        //Creates the file.
         File dir= new File("C:\\Users\\USER\\Desktop\\Obayed");
         dir.mkdir();
         File file1= new File("C:\\Users\\USER\\Desktop\\Obayed\\std.txt");
         try{

             file1.createNewFile();
         }
         catch (Exception e)
         {
             System.out.println("error");
         }


         //Writes the integers into the file.
         boolean IsPositive=true;
         int x;
         Scanner sc= new Scanner(System.in);
         try {

             Formatter form= new Formatter("C:\\Users\\USER\\Desktop\\Obayed\\std.txt");

             while(IsPositive) {

                 x=sc.nextInt();
                 if(x>=0)
                 {
                     form.format(x+"\n");
                 }
                 else{IsPositive=false;}


             }
             form.close();
         }
         catch (Exception e)
         {
             System.out.println("error");
         }



         //Reads the file.
         int count=0;
         int sum = 0;
         try{
             
             Scanner s2=new Scanner(file1);
             while(s2.hasNext())
             {
                 sum=sum+s2.nextInt();
                 count++;
             }
             
         }catch (Exception e)
         {
             System.out.println("error");
         }
         double avg= sum/count;
        System.out.println("The average is:"+avg );







    }

    }
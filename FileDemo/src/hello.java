import java.io.*;
public class hello {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Public\\Downloads\\test");
        System.out.println(dir.mkdir());
        String dirloc = dir.getAbsolutePath();
        System.out.println(dirloc);
        System.out.println(dir.getName());

        File file1 = new File("C:\\Users\\Public\\Downloads\\test\\std.txt");
        File file2 = new File("C:\\Users\\Public\\Downloads\\test\\tch.txt");
        File file3 = new File("C:\\Users\\Public\\Downloads\\test\\emp.txt");

        try{
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        }
        catch (Exception e){

        }

    }
}

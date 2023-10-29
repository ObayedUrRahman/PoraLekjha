import java.util.*;

public class Main {
    public static void main(String[] args) {
        EBook eb = new EBook () ;
        PaperBook pb = new PaperBook () ;
        Book b = new Book ("Microcontroller", "Mr. X") ;

        Scanner nc = new Scanner(System.in);
        String Title;
        Title = nc.next();
        eb.setTitle(Title);
        eb.setAuthor("Deitle");
        eb.setPdfSize(10.5);
        eb.setUrl("http:\\url");

        System.out.println(eb.getTitle());
        System.out.println(eb.getUrl());

        pb.setTitle("C Programming");
        pb.setCount(20);

        System.out.println(pb.getTitle());
        System.out.println(pb.getCount());

        System.out.println(b.getTitle() + ", " + b.getAuthor());


        b= pb ;
        b = new PaperBook ( ) ;

        PaperBook pb2 = (PaperBook) b ;

        pb2.setCount(30);
        System.out.println(pb2.getTitle() + ", count: " + pb2.getCount());

    }
}
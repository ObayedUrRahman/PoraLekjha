import java.util.*;

public class Hello {

    static LinkedList<Integer> list = new LinkedList<Integer> () ;

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Producer p = new Producer (list) ;
        p.start();
        Consumer c = new Consumer (list) ;
        c.start();
    }

}

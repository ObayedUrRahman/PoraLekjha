import java.util.ArrayList;

public class MyLinkedList {
    private ArrayList <String> al = new ArrayList <String> () ;

    public void addLL (String s)
    {
        al.add(s) ;
    }
    public void add (String s)
    {
        this.al.add(s) ;
    }
    public ArrayList<String> getList ()
    {
        return al ;
    }
}

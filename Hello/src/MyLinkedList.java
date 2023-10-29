public class MyLinkedList {
    private Node head ;


    MyLinkedList ()
    {
        this.head = new Node (0) ;
    }

    public void insert (int value)
    {
        Node tail = this.head ;
        while (tail.hasNext())
            tail = tail.getNext ();

        Node n = new Node (value) ;
        tail.setNext(n);
    }
    public void insert (int index, int value)
    {
        // insert at specific index where index starts with zero
        //  without head. If index greather than length then print
        // index out of bound

    }

    public void addFirst ()
    {

    }
    public void addLast ()
    {

    }
    public void removeFirst ()
    {

    }
    public void removeLast ()
    {

    }
    public void remove (int value)
    {
        // remove the first occurrence of value
    }
    public void sortAssending ()
    {
        // sort ascending order
    }

    public boolean hasElement (int value)
    {
        // returns true or false if value exists in list
        return true ;
    }

    public void push (Node n)
    {
        // add on top / first of the list
    }
    public String toString ()
    {
        String str = "[" ;
        Node p = this.head ;
        while (p.hasNext())
        {
            p = p.getNext() ;
            str = str + p.getValue() + ", " ;
        }
        str = str + "]" ;
        return str ;
    }
}

public class Node {
    private int value ;
    private Node next ;
    Node (int i)
    {
        this.value = i ;
        this.next = null ;
    }
    public int getValue ()
    {
        return this.value ;
    }
    public boolean hasNext ()
    {
        if (this.next == null)
            return false ;
        return true ;
    }
    public void setNext (Node n)
    {
        this.next = n ;
    }
    public Node getNext ()
    {
        return this.next ;
    }
}

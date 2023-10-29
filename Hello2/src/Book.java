public class Book {
    private String author ;
    private String title = "hello" ;

    Book ()
    {

    }
    Book (String t, String a)
    {
        this.title = t ;
        this.author = a ;
    }
    public void setAuthor (String s)
    {
        this.author = s ;
    }
    public void setTitle (String s)
    {
        this.title = s ;
    }
    public String getAuthor ()
    {
        return this.author ;
    }

    public String getTitle ()
    {
        return this.title ;
    }
}

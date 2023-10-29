public class EBook extends Book {
    private String url ;
    private double pdfSize ;

    public void setUrl (String s)
    {
        this.url = s;
    }
    public void setPdfSize (double size)
    {
        this.pdfSize = size ;
    }
    public String getUrl ()
    {
        return this.url ;
    }
    public double getPdfSize ()
    {
        return this.pdfSize ;
    }
}

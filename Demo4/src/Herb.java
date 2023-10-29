public class Herb extends Plant{

    private boolean isMedicinal;
    private String season;

    Herb(String N, String C, boolean M,String S) {
        super(N, C);
        this.isMedicinal=M;
        this.season= S;
    }
    public void setIsMedical(boolean N)
    {
        this.isMedicinal=N;
    }
    public boolean getIsMedical()
    {
        return this.isMedicinal;
    }
    public void setSeason(String N)
    {
        this.season=N;
    }
    public String getSeason()
    {
        return this.season;
    }
    public String toString()
    {
        return ("Name:"+this.getName()+"\nColor:"+this.getColor()+"\nIs Medicinal:"+isMedicinal+"\nSeason:"+season);
    }

}

public class Flower extends Plant{

    private boolean hasSmell;
    private boolean hasThorn;

    Flower(String N, String C, boolean S, boolean T) {
        super(N, C);
        this.hasSmell=S;
        this.hasThorn=T;

    }
    public void setHasSmell(boolean N)
    {
        this.hasSmell=N;
    }
    public void setHasThorn(boolean N)
    {
        this.hasThorn=N;
    }
    public boolean getHasSmell()
    {
        return this.hasSmell;
    }
    public boolean getHasThorn()
    {
        return this.hasThorn;
    }
    public String toString()
    {
        return ("Name:"+this.getName()+"\nColor:"+this.getColor()+"\nHas Smell:"+hasSmell+"\nHas Thorn:"+hasThorn);
    }

}


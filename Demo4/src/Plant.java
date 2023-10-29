public class Plant {
    private String name;
    private String color;

    Plant(String N, String C)
    {
        this.name=N;
        this.color=C;
    }

    //public Plant() {

    //}

    public void setName(String N)
    {
        this.name=N;
    }
    public void setColor(String N)
    {
        this.color=N;
    }
    public String getName()
    {
        return this.name;
    }
    public String getColor()
    {
        return this.color;
    }
    public String toString()
    {

        return ("Name:"+this.name+" Color:"+this.color);
    }
    static void add(Plant[] j,Plant p)//IDK wtf i am doing i tried and i am done with this shit Sami mama tui ektu try koris i searched object array but did not understand shit.
    {
        int i=0;
        while(!j[i].name.isEmpty())
        {
            i++;
        }
        j[i+1]=p;
    }
}

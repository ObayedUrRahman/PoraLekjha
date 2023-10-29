public class Quiz {
    private int Id;
    private int mark;

    Quiz(int i, int j)
    {
        this.Id=i;
        this.mark=j;
    }

    void setId(int i)
    {
        this.Id=i;
    }
    void setMark(int i)
    {
        this.mark=i;
    }
    int getId()
    {
        return this.Id;
    }
    int getMark()
    {
        return this.mark;
    }
}

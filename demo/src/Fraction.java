
public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;

    }
    public int getNumerator()
    {
        return this.numerator;

    }
    public int getDenominator()
    {
        return this.denominator;

    }
    public void setNumerator(int numerator)
    {
        this.numerator= numerator;
    }
    public void setDenominator(int Denominator)
    {
        this.denominator= Denominator;
    }
    public String toString()
    {

        return (this.numerator+"/"+this.denominator);
    }
    public void add(Fraction f)
    {
        System.out.print(((this.numerator*f.denominator)+(f.numerator*this.denominator))+"/"+f.denominator*this.denominator);
    }
    public void sub(Fraction f)
    {
        System.out.print(((this.numerator*f.denominator)-(f.numerator*this.denominator))+"/"+f.denominator*this.denominator);
    }
    public void multiplication(Fraction f)
    {
        System.out.print((this.numerator*f.numerator)+"/"+f.denominator*this.denominator);
    }
    public void division(Fraction f)
    {
        System.out.print((this.numerator*f.denominator)+"/"+f.numerator*this.denominator);
    }
}

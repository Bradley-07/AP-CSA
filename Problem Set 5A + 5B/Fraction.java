
/**
 * Bradley Phan
 * January 15th 2025
 * problem set 5a + 5b
 */
public class Fraction{
    
    private int numerator;
    private int denominator;
    
public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    
    // default 
    public Fraction(int num, int denom) {
        numerator = num;
        setDenom(denom);
    }
    
    //copy 
      public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }
    
    //string
    public Fraction(String fraction) {
        numerator = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
        if (Integer.parseInt(fraction.substring(fraction.indexOf("/")+1)) == 0) {
            System.out.println("Denominator can't be zero");
            denominator = 1;
        } else {
            denominator = Integer.parseInt(fraction.substring(fraction.indexOf("/")+1)); 
        }       
    }
    
    
    //get numerator        
    public int GetNum() {
        return numerator;
    }
    
    //get denominator
    public int GetDenom() {
        return denominator;
    }
    
    //change to string
    public String toString() {
        return numerator+"/"+denominator;
    }
    
    //change to double
    public double toDouble() {
        return (double) numerator / denominator;
    }
    
      //set numerator
     public void setNum(int num) {
        numerator = num;
    }
    
    //set denominator
    public void setDenom(int denom) {
        if (denom == 0) {
            System.out.println("Denominator can't be zero");
            denominator = 1;
        } else {
            denominator = denom; 
        }        
    }

    //simplifying
   public void reduce() {
        int factor = GCF(numerator, denominator);
        
        numerator /= factor;
        denominator /= factor;
        
        
    }
    
    //add
    public static Fraction add(Fraction a, Fraction b) {
        int denominatora = a.denominator;
        int denominatorb = b.denominator;
        
        a.numerator*= denominatorb;
        a.denominator*= denominatorb;
        b.numerator*= denominatora;
        b.denominator*= denominatora;
        
        int newNUM = a.numerator + b.numerator;
        int newDEN = a.denominator;

        return new Fraction(newNUM, newDEN);
    }
    
    //substract
    public static Fraction subtract(Fraction a, Fraction b) {
      int denominatora = a.denominator;
        int denominatorb = b.denominator;
        
        a.numerator*= denominatorb;
        a.denominator*= denominatorb;
        b.numerator*= denominatora;
        b.denominator*= denominatora;
        
        int newNUM = a.numerator - b.numerator;
        int newDEN = a.denominator;

        return new Fraction(newNUM, newDEN);
    }
    
    //multiply
        public static Fraction multiply(Fraction a, Fraction b) {
        int Numerator = a.numerator*b.numerator;
        int Denominator = a.denominator*b.denominator;
        
        return new Fraction(Numerator, Denominator);
    }
    
    //divide
    public static Fraction divide(Fraction a, Fraction b) {
        int Numerator = a.numerator*b.denominator;
        int Denominator = a.denominator*b.numerator;
        
        return new Fraction(Numerator, Denominator);
    }
   
    //greatest common facot
    public int GCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
    }
    
    //randomizer
     public void randomize() {
        numerator = (int) (Math.random() * 9) + 1;
        denominator = (int) (Math.random() * 9) + 1;
    }

}

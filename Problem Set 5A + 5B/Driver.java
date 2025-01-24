
/**
 * Bradley Phan
 * January 15th 2025
 */
public class Driver{
     public static void main (String[] args) {
         
         
        Fraction whole = new Fraction();
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction("1/3");
        Fraction AnotherHalf = new Fraction(half);
        Fraction TestFraction = new Fraction(48, 144);

        
        System.out.println("Whole Fraction");
        System.out.println(whole);
        System.out.println("");
        System.out.println("Half Fraction");
        System.out.println(half);
        System.out.println("");
        System.out.println("One-third Fraction");
        System.out.println(third);
        System.out.println("");
        System.out.println("Copy of Half Fraction");
        System.out.println(AnotherHalf);
        System.out.println("");
        System.out.println("Test Fraction");
        System.out.println(TestFraction);
        
        System.out.println("");
        System.out.println("Numerator of Half Fraction");
        System.out.println(AnotherHalf.GetNum());
        System.out.println("");
        System.out.println("Denominator of Half Fraction");
        System.out.println(AnotherHalf.GetDenom());
        System.out.println("");
        System.out.println("Half Fraction as String");
        System.out.println(AnotherHalf.toString());
        System.out.println("");
        System.out.println("Half Fraction as Double");
        System.out.println(AnotherHalf.toDouble());
        
        
        System.out.println("");
        System.out.println("Simplified of the Test Fraction");
        TestFraction.reduce();
        System.out.println(TestFraction);
        
        System.out.println(" ");
        System.out.println("Addition between Half and Third Fractio in a Simplified Fraction");
        Fraction sum = Fraction.add(half, third);
        sum.reduce();
        System.out.println(sum);

        System.out.println(" ");
        System.out.println("Substraction between Half and Third Fractio in a Simplified Fraction");
        Fraction sub = Fraction.subtract(half, third);
        sub.reduce();
        System.out.println(sub);

        System.out.println(" ");
        System.out.println("Multiplication between Half and Third Fractio in a Simplified Fraction");
        Fraction multi = Fraction.multiply(half, third);
        multi.reduce();
        System.out.println(multi);
        
        System.out.println(" ");
        System.out.println("Division between Half and Third Fractio in a Simplified Fraction");
        Fraction divi = Fraction.divide(half, third);
        divi.reduce();
        System.out.println(divi);
        
        
        
        System.out.println(" ");
        System.out.println("Greatest Common Factor between Numerator and Denominator of Test Fraction");
        System.out.println(TestFraction.GCF(48,144));
         
        
        
    }       
    
 
}

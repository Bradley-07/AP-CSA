
/**
 *Bradley Phan
 *January 15th 2025
 *Problem set 5a +5b
 */
public class FindingPI{
 public static void main (String[] args) {
        Fraction Milu = new Fraction(355, 113);
        Fraction Pi = new Fraction(22, 7);
        final double EPSILON = Math.abs(Math.PI - Milu.toDouble() );
        double difference = Math.abs(Pi.toDouble()-Math.PI);
        
        while (difference >= EPSILON) {
            
            if (Pi.toDouble() > Math.PI) {
                Pi.setDenom(Pi.GetDenom() + 1);

             
            } else {
                Pi.setNum(Pi.GetNum() + 1);
            }
            System.out.println(Pi.toString());
            difference = Math.abs(Pi.toDouble()-Math.PI);
        }
    }
  
}

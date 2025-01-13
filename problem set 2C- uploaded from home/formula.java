/**
 * Bradley Phan
 * Oct 1 2024
 * Problem set 2C
 */

public class formula{
    public orderedPair quadraticF(double a,double b, double c){
        double r1 = ((-b) + Math.sqrt(b*b-(4*a*c))) / (2*a);
        double r2 = ((-b) - Math.sqrt(b*b-(4*a*c)))/ (2*a);
        return new orderedPair(r1, r2);
    }
    
    public orderedPair slopeFormula(double a,double b, double c, double d){
        double r1 = (d-b)/(c-a);
    return new orderedPair(r1);
    }
    
    public orderedPair midPoint(double a, double b, double c, double d){
    double r1= (a+c)/2;
    double r2 = (b+d)/2;
    return new orderedPair(r1,r2);
    }
    
    public orderedPair arithmeticSum(double a, double b, double c){
    double r1 = (a/2)*((2*b)+(a-1)*c);
    return new orderedPair(r1);
    }
    
    public orderedPair geometricSum(double a, double b, double c){
    double r1 = (b*(1-Math.pow(c,a)))/(1-c);
    return new orderedPair(r1);
    }
    
    public orderedPair Random(double a){
    double r1 = (int)(Math.random()*a) + 1;
    return new orderedPair(r1);
    }

}

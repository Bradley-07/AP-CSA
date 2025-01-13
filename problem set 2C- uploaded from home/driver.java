/**
 * Bradley Phan
 * Oct 1 2024
 * Problem set 2C
 */

import java.util.Scanner;
public class driver{

public static void main(String[]args){
orderedPair op = new orderedPair();
Scanner input = new Scanner(System.in);
formula fm = new formula();


//quadratic formula
System.out.println("Quadratic Formula: Find the roots of a^2 +bx + c. Enter a, b and c. ");
System.out.print("a: ");
int num1= input.nextInt();
System.out.print("b: ");
int num2= input.nextInt();
System.out.print("c: ");
int num3= input.nextInt();
System.out.println("The solutions for "+num1+"x^2 + "+num2+ "x + "+num3+" are: "+ fm.quadraticF(num1,num2,num3));
System.out.println("-----------------------------------");

//slope formula
System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
System.out.print("x1: ");
int num15 = input.nextInt();
System.out.print("y1: ");
int num16 = input.nextInt();
System.out.print("x2: ");
int num17 = input.nextInt();
System.out.print("y2: ");
int num18 = input.nextInt();
System.out.println("The line between ("+num15+","+num16+")"+ " and (" + num17+","+num18+") has a slope of :" + fm.slopeFormula(num15,num16,num17,num18));
System.out.println("-----------------------------------");

//op.getX();

//midpoint
System.out.println("MID POINT: Find the slope between points (x1,y1) and (x2,y2)");
System.out.print("x1: ");
int num4 = input.nextInt();
System.out.print("y1: ");
int num5 = input.nextInt();
System.out.print("x2: ");
int num6 = input.nextInt();
System.out.print("y2: ");
int num7 = input.nextInt();
System.out.println("The midpoint between ("+num4+","+num5+")"+ " and (" + num6+","+num7+") is :" + fm.midPoint(num4,num5,num6,num7));
System.out.println("-----------------------------------");

//sum of arithmetic sequence
System.out.println("SUM OF AN ARITHMETIC SERIES");
System.out.print("Number of terms: ");
int num8 = input.nextInt();
System.out.print("Starts with: ");
int num9 = input.nextInt();
System.out.print("Increases by: ");
int num10 = input.nextInt();
System.out.println("The sum of the first "+num8+ " terms of an arithmetic series that starts with "+num9+" and increases by "+num10+ " is: "+fm.arithmeticSum(num8,num9,num10));
System.out.println("-----------------------------------");


//sum of geometric sequence
System.out.println("SUM OF AN GEOMETRIC SERIES");
System.out.print("Number of terms: ");
int num11 = input.nextInt();
System.out.print("Starts with: ");
int num12 = input.nextInt();
System.out.print("Rate of Growth: ");
int num13 = input.nextInt();
System.out.println("The sum of the first "+num11+ " terms of a finite geometric series that starts with "+num12+" and increases by a rate of "+num13+ " is: "+fm.geometricSum(num11,num12,num13));
System.out.println("-----------------------------------");

//die roller
System.out.println("DIE ROLLER");
System.out.print("How many sides does your die have? ");
int num14 = input.nextInt();
System.out.println("Rolling a "+num14+" -sided die... you got a "+ fm.Random(num14) );









}
    
}
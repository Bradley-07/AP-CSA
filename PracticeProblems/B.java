
/**
 * Bradley Phan
 * Wednesday Sep 11
 * Problem set 1B calculation
 */

import java.util.Scanner;

public class B{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
/**
 * Q1:Celcius to Fahrenheit
*/
System.out.println("*** Celcius --> Fahrenheit *** ");

System.out.print("Enter the temperature in Celcius:");
double celcius = input.nextDouble();
double fahrenheit = celcius * 9.0/5 + 32;

System.out.println(celcius+" Celcius = "+fahrenheit+" Fahrenheit");

System.out.println();
/**
 * Q2:BMI body weight
 */
System.out.println("*** BMI Calculator ***");
System.out.print("Enter a weight in kg: ");
double weight = input.nextDouble();

System.out.print("Enter a height in m: ");
double height = input.nextDouble();

double BMI = weight / (height * height);

System.out.println("A "+height+"m tall adult who weighs "+weight+"kg has"+
" a BMI of "+BMI);

System.out.println();
/**
 * Q3: days to weeks and days
 */

System.out.println("*** Days --> Weeks and Days ***");
System.out.print("Enter a  number of days: ");
int days = input.nextInt();
int day = days % 7;
int week = days / 7;
System.out.println(days+" days is equal to "+week+" weeks, "+day+" days");

System.out.println();

/**
 * Q4: Receipt generator
 */

System.out.println("*** Receipt Generator ***");
System.out.print("Numbers of unit you're buying: ");
double number = input.nextDouble();
System.out.print("Price per unit: ");
double price = input.nextDouble();
System.out.print("Tax rate in %: ");
double tax = input.nextDouble();

double total = number * price;
double tt= total * tax/100;
double intotal = total + tt;

System.out.println("Purchasing "+number +" units at $"+ price+" with "+tax+ 
"% will cost $"+ intotal);

System.out.println();
/**
 * Q5: Sum of digits
 */

System.out.println("*** Sum of digits ***");
System.out.print("Enter your 3 digits number: ");
int n = input.nextInt();
int r1 = n%10; /** add this*/
int q1 = n/10;
int r2 = q1%10; /** add this*/
int q2 = q1/10; /** add this*/

int totaltotal = r1 + r2 + q2;

System.out.print("the sum of your digits is "+ totaltotal);



























}
}

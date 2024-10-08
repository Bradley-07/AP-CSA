/**
 * Bradley Phan
 * Problem set 1A
 * Sep 9th 2024
 */

import java.util.Scanner;

public class Questions{
public static void main(String[]args){
Scanner input = new Scanner(System. in);

System.out.print("What's your favourite course? ");
String course = input.nextLine();

System.out.print("What's your favourite show? ");
String show = input.nextLine();

System.out.print("How many hours do you spend studying each day? ");
int study = input.nextInt();

System.out.print("How many hours do you spend watching shows each day? ");
int shows = input.nextInt();

System.out.println();
System.out.println("Summary:");
System.out.println("Your favourite course is: " + course);
System.out.println("Your favourite show is: "+ show);

System.out.println("You spend "+study+ " hours studying each day");
System.out.println("You spend "+shows+ " hours watching shows each day");

int total = study +shows;

System.out.print("In total, you spend "+ total+ " studying and watching"
+" shows each day");




}
}

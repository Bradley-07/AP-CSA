/**
 * Bradley Phan
 * Sep 25 2024
 * Problem Set 2B
 */

import java.util.Scanner;

public class Driver{

public static void main(String[]args){
Scanner input = new Scanner(System.in);
stringTools sTools = new stringTools();


//last letter

System.out.println("Last Letter Test");
System.out.print("Enter a word with at least one character: ");
String answer1 = input.nextLine();
System.out.println("The Last Letter is: "+ sTools.lastLetter(answer1));
System.out.println("-------------------");

//format phone number
System.out.println("Format Number");
System.out.print("Enter a 10 digits phone number:");
String answer2 = input.nextLine();
System.out.println("Format Phone number: "+sTools.formatNumber(answer2));
System.out.println("-------------------");

//Middle three
System.out.println("Middle Three");
System.out.print("Enter a word with at least 3 characters: ");
String answer3 = input.nextLine();
System.out.println("3 Middle Letters are: "+sTools.middleThree(answer3));
System.out.println("-------------------");


//swap last two
System.out.println("Swapping Last Two ");
System.out.print("Enter a word with at least 2 characters: ");
String answer4 = input.nextLine();
System.out.println("The new word with swapped last 2 letters: "+sTools.lastTwo(answer4));
System.out.println("-------------------");
//

//font again
System.out.println("If the letter(s) from the start is simmilar to the letter(s) at the end ");
System.out.print("Enter a word: ");
String answer5 = input.nextLine();
System.out.print("Enter the number of letter u want to compare: ");
int answer6 = input.nextInt();
System.out.print("The answer is: "+ sTools.fontAgain(answer5,answer6));


    
}

}



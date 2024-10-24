/**
 * Bradley Phan
 * Oct 24th 2024
 * Problem Set 4A
 */
import java.util.Scanner;

public class Driver{
public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    
    int x = (int)(Math.random()*101);
    
    System.out.println("I'm thinking of a number between 1- 100. Can you guess it? ");
    int answer = input.nextInt();
    int tries = 0;
    
    while (answer != x){
        System.out.print("Your guess: ");
        if (answer < x){
    System.out.println("Nope that guess is too low" );
    } else if(answer >x){
     System.out.println("Nope that guess is too high" );
    }
    answer = input.nextInt();
tries++;

}


if(answer == x){
System.out.println("Nice, you got it");
System.out.println("It took you "+ tries+ " tries.");
}



}
}
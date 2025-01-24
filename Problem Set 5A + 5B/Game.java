
/**
 * Bradley Phan
 * Jan 15th 2025
 * problem set 5a + 5b
 */

import java.util.Scanner;

public class Game{
public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        Fraction fractionA = new Fraction();        
        Fraction fractionB = new Fraction();
        Fraction guessFrac = new Fraction();

        boolean play = true;
        int victory = 0;
        int game = 0;
        int mode =  1;
        
        
        fractionA.randomize();
        fractionB.randomize();
        
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

    

        
        while (play == true) {
            fractionA.randomize();
            fractionB.randomize();
            mode = (int) (Math.random() * 4) + 1;
            
            //ADD
            if (mode == 1) {
                System.out.print("What is "+ fractionA + " + " + fractionB + "= ");
                Fraction answer = Fraction.add(fractionA, fractionB);
                answer.reduce();
                String response = input.nextLine();

                //Compare answer to guess
                if (answer.toString().equals(response)) {
                    System.out.println("Correct");
                    victory += 1;
                    game += 1;
                } else if ("quit".equals(response)) {
                    play = false;
                    System.out.println("Game Over!, You've Won " +
                    victory + " games out of " + game + " games." +
                    " Your win/loss ratio was " + victory +"/"+ game+ ", for a score of "  +(int) (0.5+ (double) victory/game*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    game += 1;
                    
                }
            }
            
            // SUBTRACT
            if (mode == 2) {
                System.out.print ("What is "+ fractionA + " - " + fractionB + "=");
                Fraction answer = Fraction.subtract(fractionA, fractionB);
                answer.reduce();
                String response = input.nextLine();

                //Compare answer to response
                if (answer.toString().equals(response)) {
                    System.out.println("Correct");
                    victory += 1;
                    game += 1;
                } else if ("quit".equals(response)) {
                    play = false;
                    System.out.println("Game Over!, You've Won " +
                    victory + " games out of "+ game + " games. " +
                    " Your win rate was " + (int) (.5+ (double) victory/game*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    game += 1;
                    
                }
            }
            
            // DIVIDE
            if (mode == 3) {
                 System.out.print ("What is "+ fractionA + " / " + fractionB + "=");
                Fraction answer = Fraction.divide(fractionA, fractionB);
                answer.reduce();
                String response = input.nextLine();

                //Compare answer to response
                if (answer.toString().equals(response)) {
                    System.out.println("Correct");
                    victory += 1;
                    game += 1;
                } else if ("quit".equals(response)) {
                    play = false;
                    System.out.println("Game Over!, You've Won " +
                    victory + " games out of "+ game + " games. " +
                    " Your win rate was " + (int) (.5+ (double) victory/game*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    game += 1;
                    
                }
            }
            
            // MULTIPLY
            if (mode == 4) {
                 System.out.print ("What is "+ fractionA + " x " + fractionB + "=");
                Fraction answer = Fraction.multiply(fractionA, fractionB);
                answer.reduce();
                String response = input.nextLine();

                //Compare answer to response
                if (answer.toString().equals(response)) {
                    System.out.println("Correct");
                    victory += 1;
                    game += 1;
                } else if ("quit".equals(response)) {
                    play = false;
                    System.out.println("Game Over!, You've Won " +
                    victory + " games out of "+ game + " games. " +
                    " Your win rate was " + (int) (.5+ (double) victory/game*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    game += 1;
                    
                }
            }
        }
}
}

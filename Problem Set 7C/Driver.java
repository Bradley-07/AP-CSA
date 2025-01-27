
/**
 *  bradley phan
 *  January 25th 2025
 *  problem set 7C
 */

import java.util.Scanner; 
import java.util.ArrayList;

public class Driver{
public static void main(String[]args){
   Scanner input = new Scanner (System.in);

   
    
   
   System.out.println(" Sieve of Eratosthenes");
    System.out.println("Enter a number to find all prime numbers less than it ");
    int answer = input.nextInt();
    ArrayList<Integer> primes = method1(answer);
    System.out.println("Primes less than " + answer + ": " + primes);
    
    System.out.println("");
    System.out.println(" Goldbach Conjecture");
    System.out.println("Enter an even number greater than 2 ");
    int even = input.nextInt();
    if (even > 2 && even % 2 == 0) {
            method2(even);
        } else {
            System.out.println("Number must be an even number more than 2 ");
        
        }
        
        System.out.println("");
       System.out.println(" Enter the first number ");
        int num1 = input.nextInt();
        ArrayList<Integer> bigInt1 = Converter(num1);
         System.out.println("");
        System.out.println("Enter the second number ");
        int num2 = input.nextInt();
        System.out.println("");
        ArrayList<Integer> bigInt2 = Converter(num2);
        ArrayList<Integer> result = method3(bigInt1, bigInt2);
  System.out.println("The sum of two integers in an arraylist : ");
        
          System.out.println(result);
       
    
    
    
}

public static ArrayList<Integer> method1(int n) {
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
    
  public static void method2(int even) {
        if (even <= 2 || even % 2 != 0) {
            System.out.println("Number must be an even number more than 2.");
            return ;
        }

        ArrayList<Integer> primes = method1(even);

        for (int prime : primes) {
            if (primes.contains(even - prime)) {
                System.out.println(even + " = " + prime + " + " + (even - prime));
                return;
            }
        }
    }
    
    
     private static ArrayList<Integer> Converter(int number) {
        ArrayList<Integer> Converter = new ArrayList<>();
        while (number > 0) {
            Converter.add(0, number % 10);
            number /= 10;
        }
        return Converter;
    }
    
      public static ArrayList<Integer> method3(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;

        
        while (num1.size() < num2.size()) {
            num1.add(0, 0);
        }
        while (num2.size() < num1.size()) {
            num2.add(0, 0);
        }

        
        for (int i = num1.size() - 1; i >= 0; i--) {
            int sum = num1.get(i) + num2.get(i) + carry;
            result.add(0, sum % 10); 
            carry = sum / 10;
        }

        
        if (carry > 0) {
            result.add(0, carry);
        }

        return result;
    }
    
     



}

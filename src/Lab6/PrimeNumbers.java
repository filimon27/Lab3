package Lab6;

import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {

//primeCheck(4);
        System.out.println(primeCheck(29));
    }
     public static boolean primeCheck(int numbers) {
         for (int i = 2; i < numbers; i++) {
             if (numbers%i==0)
                 return false;


         }
         return true;
     }
}

package Lab3;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        System.out.println(" Go Ahead and Enter the temperature in celsius");





        Scanner keyboard = new Scanner(System.in);
        double celsius= keyboard.nextDouble();

        double Fahrenheit= (celsius*1.8)+32;


        System.out.println(" The Temperature  in Fahrenheit is = " + Fahrenheit);

    }

}

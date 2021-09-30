package Lab3;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("please enter the centimeter values");
        double cm= keyboard.nextDouble();
        double ft=(cm/30.48);
        double in=(cm/2.48);
        System.out.println("the equivalent of of "+cm + "cm is " + ft + " ft" +"\n and "+ in + "in"  );
    }
}

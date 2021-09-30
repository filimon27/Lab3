package Lab3;

import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your weight in pound");
        double weight= input.nextDouble();
        double calories= weight*19;

        System.out.println("the number of calories you need in one day is " + calories + " calories");
    }
}

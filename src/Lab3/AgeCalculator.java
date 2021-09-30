package Lab3;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the year you were born");
        int yearBorn= input.nextInt();
        int age= (2021-yearBorn);
        System.out.println("You were born in "+ yearBorn + " and will be (are) " + age + " this year");
    }
}

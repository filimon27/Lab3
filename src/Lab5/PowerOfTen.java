package Lab5;

import java.util.Scanner;

public class PowerOfTen {

    public static void main(String[] args) {

        System.out.println("Enter the number of the power and i will give you the corresponding name ");
        Scanner keyboard= new Scanner(System.in);
        int power=keyboard.nextInt();

        if(power==0) {
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("One");

        }
        else if(power==1){

            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Ten");

        }
        else if(power ==2){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Hundred");

        }
        else if(power ==3){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Thousand");

        }
        else if(power ==6){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Million");

        }
        else if(power ==9){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Billion");

        }
        else if(power ==12){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Trillion");

        }
        else if(power ==15){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Quadrillion");

        }
        else if(power ==18){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Quintillion");

        }
        else if(power ==21){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Sextillion");

        }
        else if(power ==30){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Nonillion");

        }
        else if(power ==100){
            System.out.print(power);
            System.out.print(" is ");
            System.out.print("Googol");

        }
        else{
            System.out.println("NO WORDS YET");

        }







    }
    }

package Lab5;

import java.util.Scanner;

public class WageCalculator {
    public static final  double HOURLY_WAGE= 7.25;

    public static void main(String[] args) {

        System.out.println("Enter the hours you worked");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        System.out.println("enter the sales you made");
        double totalSales = input.nextDouble();
        double wage, commission;
        double regularWage= HOURLY_WAGE*40;
        double otWage= 1.5*(HOURLY_WAGE*(hours-40));

        if (totalSales >= 300) {
            commission = 0.15 * totalSales;
            if(hours >40){
            wage= regularWage+otWage+commission;
                System.out.println("your total wage is "+wage);
            }
            else if(hours<40) {
                wage = regularWage + commission;
                System.out.println("your total wage is "+wage);
            }
        } else if (totalSales >= 99.99 && totalSales <= 299.99){
            commission = 0.1 * totalSales;
            if(hours>40){
                wage= regularWage+otWage+commission;
                System.out.println("your total wage is "+wage);
            }
            else if(hours<40){
                wage= regularWage+commission;
                System.out.println("your total wage is "+wage);
            }
       }else
        commission= 0.05*totalSales;
        if(hours>40){
            wage=regularWage+otWage+commission;
            System.out.println("your total wage is "+wage);
        }
        else if(hours<40){
            wage=regularWage+commission;
            System.out.println("your total wage is "+wage);
        }









        }

    }



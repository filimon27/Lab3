package Lab10;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double [] yearlyTemperature= new double[12];
        double [] monthlyTemperature= new double[31];

        Scanner input= new Scanner(System.in);
        double highTemp=0.0;
        double lowTemp=0.0;
        double diff=0.0;
        double sum=0.0;
        double avgTemp=0.0;

        for(int i=0; i<yearlyTemperature.length; i++){

            for(int j=0;j<monthlyTemperature.length;j++){

                System.out.println("enter the temperature of the month  " +  (i+1) + " and day " + (j+1) );
                 monthlyTemperature[j]= input.nextDouble();


                if(monthlyTemperature[j]>highTemp) {
                    highTemp = monthlyTemperature[j];

                }else if(monthlyTemperature[j]<lowTemp){
                    lowTemp=monthlyTemperature[j];
                }
                diff= highTemp-lowTemp;
                sum+= monthlyTemperature[j];
                avgTemp=sum/ monthlyTemperature.length;


            }


        }
            System.out.println(" the hottest day of the year" +   highTemp);
            System.out.println("the coldest day of the year is " + lowTemp);
            System.out.println("the average temperature is " + avgTemp);
            System.out.println(" the difference in temperature between hottest and coldest " +diff );

        }

    }



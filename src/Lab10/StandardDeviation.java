package Lab10;

import java.util.Scanner;

public class StandardDeviation {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("please input the number of elements (N) : ");
        int n= in.nextInt();
        double [] arr= new double[n];
        double sum= 0.0;
        double standardDev=0.0;

        for (int i = 0; i <arr.length; i++) {
            System.out.println("Please enter the values ");
             arr[i]= in.nextDouble();
             sum= sum+arr[i];
             double mean=sum/n;
             standardDev+= Math.abs((Math.pow((arr[i]-mean),2))/n);

        }

        System.out.println("The standard deviation is " + standardDev);

    }
}

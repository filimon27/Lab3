package Lab3;

import java.util.Scanner;

public class MathDemo {
    public static final double PI=3.14;
        public static void main(String[] args) {
            double a,b,c,x,y, R,result,result2,result3;
            x=5.0;
            y=6.0;
            R=4.0;
            System.out.println("please  enter the values a,b and c");

            Scanner keyboard= new Scanner(System.in);
            a= keyboard.nextDouble();
            b=keyboard.nextDouble();
            c=keyboard.nextDouble();
            double area= PI*Math.pow(R,2);

            result=Math.sqrt(Math.pow(b,2) + 4 *(a*c));
            result2= Math.sqrt(x+4*(Math.pow(y,3)));
            result3= Math.cbrt(x*y);
            System.out.println(result + "\n"+ result2+"\n"+result3 + "\n"+ area);




        }
    }




package Lab10;

import java.util.Random;
import java.util.Scanner;

public class Fortune {
    String[] fortuneList= new String[10];



    public Fortune(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) {
    }

    public static void main(String[] args) {

        Fortune one= new Fortune("you will get a 4.0 GPA this semester"," this is just a hey from GOD",
                "Happiness is programming"," satisfaction follows hard work"," patience is virtue"," enjoy your life"," you will be a google developer"," you will win the lottery  tomorrow","marriage is on his way"," a new car is waiting you outside");
        Scanner in= new Scanner(System.in);
        Random random = new Random();
        System.out.println(" Enter a Y or N for your fortune");
         String user=in.next();
         // while(user!="N"){


        //  }
        System.out.println(one.fortuneList[random.nextInt(10)]);
    }

}

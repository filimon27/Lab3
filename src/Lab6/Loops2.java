package Lab6;

public class Loops2 {
    public static void main(String[] args) {

        // Using while loop
        /*
        int n=5;
         int sum=0;
         while(n<=50){

             sum=sum+n;
             n=n+5;
         }
        System.out.println(sum);

         */

        //Using do while
        /*
        int n=5;
        int sum=0;
         do{
             sum= sum+n;
             n=n+5;

         }while(n<=50);
        System.out.println(sum);

         */

        // Using for loop
         int sum=0;
         for(int i=5; i<=50;i++){

             sum=sum+i;
             i=i+4;
         }
        System.out.println(sum);

    }
}

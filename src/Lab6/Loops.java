package Lab6;

public class Loops {
    public static void main(String[] args) {
        /*
         //using while loop

        int n=1;
        int sum=0;
        while(n<=100){

            sum= sum+n;
            n++;

        }
        System.out.println(sum);

         */

        // using do while
        /*
      int sum=0,number=1;
        do{
            sum+=number;
            number++;

        }while(number<=100);
        System.out.println(sum);

         */

      // using for loop
        int sum=0;
        for(int i=1; i<=100; i++){
            sum= sum+i;


        }
        System.out.println(sum);
    }
}

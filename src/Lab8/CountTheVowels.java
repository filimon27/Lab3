package Lab8;


import java.util.Scanner;

public class CountTheVowels {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("PLease enter the sentence");
        String sentence= keyboard.next().trim();

        int count1= 0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        while( sentence.length()!=0){
        for(int i=0; i<sentence.length(); i++) {

            if (sentence.toLowerCase().charAt(i) == 'a') {

                count1 = count1 + 1;
            }
        }
        System.out.println("# of 'a' " + count1);
            for (int i=0; i<sentence.length();i++){
             if (sentence.toLowerCase().charAt(i)=='e'){

                count2= count2+1;

            }}
        System.out.println("# of 'e' " + count2);
            for (int i=0; i<sentence.length();i++){
            if(sentence.toLowerCase().charAt(i)=='i'){
                count3=count3+1;

            }}
        System.out.println("# of 'i' " + count3);
            for (int i=0; i<sentence.length();i++){
            if(sentence.toLowerCase().charAt(i)=='o'){

                count4=count4+1;

            }}
        System.out.println("# of 'o' " + count4);
            for (int i=0; i<sentence.length();i++){
           if(sentence.toLowerCase().charAt(i)=='u'){

                count5=count5+1;

            }
        }
        System.out.println("# of 'u' " + count5);

            System.out.println(" enter the  next sentence");
            sentence=keyboard.nextLine();



    }}

}

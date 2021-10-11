package Lab8;

import java.util.Scanner;

public class DnaStrand {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char base;
        String dnaStrand;
        System.out.println("Enter DNA strand ");
        dnaStrand= input.nextLine();
        StringBuffer word;

         while(dnaStrand.trim().length()!=0){
                word= new StringBuffer();
             for (int i = 0; i < dnaStrand.length(); i++) {
                  base= dnaStrand.charAt(i);

                 if (base == 'A' )
                     base = 'T';

                 else if(base == 'G')
                     base = 'C';


                 word= word.append(base);
                 }

             System.out.println(word.toString());
             System.out.println("");
             System.out.println("Enter next DNA sequence");
             dnaStrand= input.nextLine();
         }




    }

}


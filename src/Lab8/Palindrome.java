package Lab8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" enter the word");
        String word= input.nextLine();
        StringBuffer rev;

        while(word.trim().length()!=0){

            rev= new StringBuffer(word);
             rev=rev.reverse();
            if (word.equalsIgnoreCase(String.valueOf(rev))){
                System.out.println(" The input word is Palindrome ");}
            else{
                System.out.println("The input word is Not palindrome");
            }
            System.out.println(" enter the word");
                word= input.nextLine();



        }
    }
}

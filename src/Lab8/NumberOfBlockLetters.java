package Lab8;

import java.util.Scanner;

public class NumberOfBlockLetters {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter the word");
        word = input.nextLine().trim();

        while(word.length()!=0) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {


                if (Character.isUpperCase(word.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count);
            System.out.println(" enter the word");
            word = input.nextLine();
        }



    }







        }


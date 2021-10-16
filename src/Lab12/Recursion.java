package Lab12;

public class Recursion {

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};

        System.out.println( sum(arr,0));
         System.out.println(findMin(arr,0));
        System.out.println(countChars("CS201"));
          printReverse("Filimon",0);





    }
    public static void printReverse(String word, int index){
        if(index == word.length())
            return;
        else{
            printReverse(word, index + 1);
            System.out.print(word.charAt(index));


        }}
    public static int sum(int [] arr, int index){
        if(index== arr.length)
            return 0;
        else
            return arr[index]+sum(arr,index+1);

    }
    public static int findMin(int [] arr, int index){
        int nextVal;
        if(index == arr.length-1)
            return arr[index];
        else
            nextVal = findMin(arr, index+1);
        if(arr[index] < nextVal)
            return arr[index];
        else
            return nextVal;
    }

    public static int countChars(String word){
        if (word.equals(""))
            return 0;
        else
            return 1 + countChars(word.substring(1));
    }

}

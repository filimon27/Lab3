package Lab6;

public class PrintTenToFourtyNine {
    public static void main(String[] args) {
        for (int i=10; i<=49;i++){
            for(int j=0; j<=9; j++){
                System.out.print(i+j + "\t");
            }
            System.out.println();
            i=i+9;
        }
    }
}

package Lab4;

public class WeightTest {

    public static void main(String[] args) {
        WeightConverter moonWeight;
        moonWeight= new WeightConverter(0.67);

        double myMoonWeight= moonWeight.convert(167);


        System.out.println("your weight on the moon is going to be "+ myMoonWeight +" lb");

    }
}




package Lab4;

public class WeightConverter {
    public static final double EARTH_GRAVITY =9.86;

     private double relativeGravity;


    public WeightConverter(double relativeGravity){
         this.relativeGravity= relativeGravity;

     }

    public double getRelativeGravity() {
        return relativeGravity;
    }

    public void setRelativeGravity(double relativeGravity) {
        this.relativeGravity = relativeGravity;
    }
    public double convert(double weight){
        return weight*relativeGravity;
    }

}

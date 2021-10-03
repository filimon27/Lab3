package Lab4;


public class CoffeeBag {
    public  static  final double TAX_RATE=7.25;
    private double bagWeight;
    private int numberOfBags;
    public static final double PRICE_PER_LB=5.99;

    public CoffeeBag(  double bagWeight, int numberOfBags){
        this.bagWeight=bagWeight;
        this.numberOfBags=numberOfBags;

    }

    public double totalPrice(){

        double totalPrice= this.bagWeight*this.numberOfBags*this.PRICE_PER_LB;
       return totalPrice;

    }
   public double totalPriceWithTax(){

       return totalPrice()+totalPrice()*TAX_RATE;
    }

    public double getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(double bagWeight) {
        this.bagWeight = bagWeight;
    }

    @Override
    public String toString() {
        return "CoffeeBag{" +
                "\nbagWeight:" + bagWeight +
                "\n numberOfBags:" + numberOfBags + " \n Price per pound: " + PRICE_PER_LB +
                " \n Sales tax:"+TAX_RATE+ "\n totalPrice:" + totalPrice() + " \n totalPrice with Tax : " + totalPriceWithTax()+
                '}';
    }
}

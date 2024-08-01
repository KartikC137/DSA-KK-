package A3_conditional_loops;


public class DiscountOfProducts {
    public static void main(String[] args) {
        double mrp = 4999;
        double discount = 99; // percent off

        double discountedPrice = (1-(discount/100))*mrp ;
        System.out.println((int)discountedPrice);

    }
}

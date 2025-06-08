package Just_Smash.app;

public class Just_SmashCalculator {
    private double total;
    private int x ;
    private double tax;

    public Just_SmashCalculator() {
        total = 0.0;
        x = 0;
        tax = 0.0;
    }

    
    public double calculateTax(double subtotal) {
        return subtotal * 0.14;
    }
}

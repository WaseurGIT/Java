public class PremiumSubscription extends Subscription {

    public double premiumFee;

    PremiumSubscription(double baseFee, double premiumFee) {
        super(baseFee);
        this.premiumFee = premiumFee;

        System.out.println("Premium Fee: " + premiumFee);
    }
}

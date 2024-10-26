public class VIPSubscription extends PremiumSubscription {

    public double vipFee;

    VIPSubscription(double baseFee, double premiumFee, double vipFee) {
        super(baseFee, premiumFee);
        this.vipFee = vipFee;

        System.out.println("VIP Fee: " + vipFee);
    }
}

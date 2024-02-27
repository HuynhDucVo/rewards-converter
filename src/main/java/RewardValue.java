public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversionRate;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }
}

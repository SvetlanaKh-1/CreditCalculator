public class CreditPaymentService {

    public int calculate(double amountRub, double durationYear, double rate) {
        double ratePerMonth = rate / (100 * 12);
        double k = (ratePerMonth * (Math.pow((1 + ratePerMonth), (durationYear * 12))))
                / ((Math.pow((1 + ratePerMonth), (durationYear * 12))) - 1);
        double payment = amountRub * k;
        return (int) payment;
    }
}
public class CreditPaymentService {

    public int calculate (double amount_rub, double duration_year, double rate) {
        double ratePerMonth = rate/(100*12);
        double k = (ratePerMonth * (Math.pow ((1 + ratePerMonth), (duration_year * 12)))) / ((Math.pow ((1 + ratePerMonth), (duration_year * 12))) - 1);
        double payment = amount_rub * k;
        return (int) payment;
    }
}

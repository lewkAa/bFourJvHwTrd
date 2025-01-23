public class CreditPaymentService {
    public int payment(double percent, double amount, double term) { ///  процент по кредиту, сумма, количество лет
        double rPercent = percent / 100;
        double termToMonth = term * 12;
        double monthPercent = rPercent / 12;
        double powedPercent = Math.pow(1 + monthPercent, termToMonth);
        double annualPayment = amount * ((monthPercent * powedPercent) / (powedPercent - 1));
        return  (int)annualPayment;
    }
}

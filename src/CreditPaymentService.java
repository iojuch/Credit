public class CreditPaymentService {
    public double calculate(int loanTerm){
        int loanAmount = 1000000;
        double loanRate = 9.99;
        double monthlyRate  = loanRate / (100 * 12);
        double pow = Math.pow(1 + monthlyRate, - loanTerm);
        double monthlyPayment = loanAmount * (monthlyRate / (1-pow));
        return monthlyPayment;
    }
}

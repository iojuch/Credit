public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPaymentFor12Months = (int) service.calculate(12);
        System.out.println("При кредите на 12 месяцев ваш ежемесячный платеж состовляее: " + monthlyPaymentFor12Months + " рублей");

        int monthlyPaymentFor24Months = (int) service.calculate(24);
        System.out.println("При кредите на 24 месяцев ваш ежемесячный платеж состовляее: " + monthlyPaymentFor24Months);

        int monthlyPaymentFor36Months = (int) service.calculate(36);
        System.out.println("При кредите на 24 месяцев ваш ежемесячный платеж состовляее: " + monthlyPaymentFor36Months);

    }
}

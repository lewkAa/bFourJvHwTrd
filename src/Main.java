public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.printf("При заданных параметрах Ваш ежемесячный платеж составит: ");
        System.out.println((int)service.payment(9.99,1000000,1)+ " рублей");

        System.out.printf("\nПри заданных параметрах Ваш ежемесячный платеж составит: ");
        System.out.println((int)service.payment(9.99,1000000,2)+ " рублей");

        System.out.printf("\nПри заданных параметрах Ваш ежемесячный платеж составит: ");
        System.out.println((int)service.payment(9.99,1000000,3)+ " рублей");

    }
}

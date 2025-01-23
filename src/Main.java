public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.print("При заданных параметрах Ваш ежемесячный платеж составит: ");
        System.out.println(service.payment(9.99,1000000,1)+ " рублей");

        System.out.print("\nПри заданных параметрах Ваш ежемесячный платеж составит: ");
        System.out.println(service.payment(9.99,1000000,2)+ " рублей");

        System.out.print("\nПри заданных параметрах Ваш ежемесячный платеж составит: ");
        System.out.println(service.payment(9.99,1000000,3)+ " рублей");


    }
}

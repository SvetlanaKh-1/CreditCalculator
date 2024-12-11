public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж на срок 1 год:");
        System.out.println(service.calculate(1_000_000, 1, 9.99));


        System.out.println();
        System.out.println("Ежемесячный платеж на срок 2 года:");
        System.out.println(service.calculate(1_000_000, 2, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж на срок 3 года:");
        System.out.println(service.calculate(1_000_000, 3, 9.99));
    }
}
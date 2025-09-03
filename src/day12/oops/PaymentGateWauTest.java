package day12.oops;

public class PaymentGateWauTest {

    public static void main(String[] args) {
       // PaymentGateway paymentGateway = new PaymentGateway();
        PaymentGateway paymentGateway;

        paymentGateway = new EsewaGateWay();
        paymentGateway.authorize("esewa");

        paymentGateway = new KhaltiGateWay();
        paymentGateway.authorize("khalti");

    }
}

package day12.oops;

public class KhaltiGateWay implements PaymentGateway{

    @Override
    public void authorize(String request) {
        System.out.println("payment authorized successfully by KHALTI");
    }
}

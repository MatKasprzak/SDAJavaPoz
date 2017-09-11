package pl.sda.poznan.chor.bank;

import org.junit.Test;

public class PaymentTest {
    @Test
    public void test() {
        Account account = new Account(8000D, 1234, 12345);

        Payment paypass = new PaypassPayment(account);
        Payment pinPayment = new PinPayment(account);
        Payment twoFactorPayment = new TwoFactorPayment(account);

        paypass.setNextPayment(pinPayment);
        pinPayment.setNextPayment(twoFactorPayment);

        paypass.handlePayment(30D);
        pinPayment.handlePayment(300D);
        twoFactorPayment.handlePayment(3000D);

    }
}
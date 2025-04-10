package Example3.ProbelmCode;

public class AmexCard implements TapAndPay {
    @Override
    public void tapandpay() {
        System.out.println("amex tapandpay");
    }
    // No refund method needed — ISP respected!
}

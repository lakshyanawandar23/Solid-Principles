package Example3.BetterCode;

import Example3.ProbelmCode.Refundable;
import Example3.ProbelmCode.TapAndPay;

public class VisaCard implements TapAndPay,Refundable{
    @Override
    public void tapandpay() {
        System.out.println("visa tapandpay");
    }

    @Override
    public void refund() {
        System.out.println("visa refund policy");
    }
}

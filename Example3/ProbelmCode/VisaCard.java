package Example3.ProbelmCode;

public class VisaCard implements CreditCard{
    @Override
  public  void tapandpay(){
        System.out.println("visa tapandpay");
    }
    @Override
 public void refund(){
        System.err.println("visa refund policy");
    }
}

package Example3.ProbelmCode;

public class AmexCard implements CreditCard{
    @Override
  public  void tapandpay(){
        System.out.println("amex tapandpay");
    }
    @Override
 public void refund(){
        throw new RuntimeException('Amex have no refund policy');
    }
}


// it will give exception becoz it forces the amex to implement the refund logic it violated ISP Principal 
// ISP=> forced the method it does not use
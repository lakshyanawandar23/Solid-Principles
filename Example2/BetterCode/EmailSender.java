package Example2.BetterCode;

public class EmailSender implements SenderInterface {
    @Override
    public  void  send(String message){
        System.err.println("Email");
      }
}



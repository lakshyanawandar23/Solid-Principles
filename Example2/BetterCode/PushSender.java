package Example2.BetterCode;

public class PushSender implements SenderInterface {
    @Override
     public  void send(String message){
        System.out.println("Push");
      }
}

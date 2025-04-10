package Example2.BetterCode;

import javax.management.Notification;

public class Sender(List<Notification> notification,String message) {
    for(Notification notification:notification){
        notification.send(message); 
    }
}


// now it is not depending on the type of notification you introduce you do not need to modify sender Class again and again 
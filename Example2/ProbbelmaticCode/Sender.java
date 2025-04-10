public class Sender {

    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            sendEmail(message);
        } else if (type.equals("SMS")) {
            sendSMS(message);
        } else if (type.equals("PUSH")) {
            sendPushNotification(message);
        } else {
            System.out.println("Invalid notification type!");
        }
    }

    private void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    private void sendPushNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}


//So whenever you add one new type of notification that class will be modified so it is violating OCP principle
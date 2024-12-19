//// Step 1: Define the Notification interface (Abstract Product)
//interface Notification {
//    void sendNotification();
//}
//
//// Step 2: Implement Concrete Products
//class EmailNotification implements Notification {
//    @Override
//    public void sendNotification() {
//        System.out.println("Sending Email Notification...");
//    }
//}
//
//class SMSNotification implements Notification {
//    @Override
//    public void sendNotification() {
//        System.out.println("Sending SMS Notification...");
//    }
//}
//
//class PushNotification implements Notification {
//    @Override
//    public void sendNotification() {
//        System.out.println("Sending Push Notification...");
//    }
//}
//
//// Step 3: Create the Abstract Factory
//abstract class NotificationFactory {
//    public abstract Notification createNotification();
//}
//
//// Step 4: Implement Concrete Factories
//class EmailNotificationFactory extends NotificationFactory {
//    @Override
//    public Notification createNotification() {
//        return new EmailNotification();
//    }
//}
//
//class SMSNotificationFactory extends NotificationFactory {
//    @Override
//    public Notification createNotification() {
//        return new SMSNotification();
//    }
//}
//
//class PushNotificationFactory extends NotificationFactory {
//    @Override
//    public Notification createNotification() {
//        return new PushNotification();
//    }
//}
//
//// Step 5: Client Code
//public class Main {
//    public static void main(String[] args) {
//        // Use EmailNotificationFactory
//        NotificationFactory emailFactory = new EmailNotificationFactory();
//        Notification emailNotification = emailFactory.createNotification();
//        emailNotification.sendNotification();
//
//        // Use SMSNotificationFactory
//        NotificationFactory smsFactory = new SMSNotificationFactory();
//        Notification smsNotification = smsFactory.createNotification();
//        smsNotification.sendNotification();
//
//        // Use PushNotificationFactory
//        NotificationFactory pushFactory = new PushNotificationFactory();
//        Notification pushNotification = pushFactory.createNotification();
//        pushNotification.sendNotification();
//    }
//}

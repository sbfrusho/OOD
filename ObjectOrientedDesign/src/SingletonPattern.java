//interface Notification {
//    void sendNotification();
//}
//
//class SMSNotification implements Notification {
//    @Override
//    public void sendNotification() {
//        System.out.println("Sending SMS...");
//    }
//}
//
//class EMAILNotification implements Notification {
//    @Override
//    public void sendNotification() {
//        System.out.println("Sending Email...");
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
//// Singleton NotificationFactory
//class NotificationFactory {
//    // Step 1: Create a private static instance of the factory
//    private static NotificationFactory instance;
//
//    // Step 2: Private constructor to prevent instantiation
//    private NotificationFactory() {
//    }
//
//    // Step 3: Provide a public static method to get the instance
//    public static NotificationFactory getInstance() {
//        if (instance == null) {
//            synchronized (NotificationFactory.class) {
//                if (instance == null) {
//                    instance = new NotificationFactory();
//                }
//            }
//        }
//        return instance;
//    }
//
//    // Factory method to create notifications
//    public Notification getNotification(String notification) {
//        if (notification == null) {
//            return null;
//        }
//        if (notification.equalsIgnoreCase("SMS")) {
//            return new SMSNotification();
//        } else if (notification.equalsIgnoreCase("EMAIL")) {
//            return new EMAILNotification();
//        } else if (notification.equalsIgnoreCase("PUSH")) {
//            return new PushNotification();
//        }
//        return null;
//    }
//}
//
//public class SingletonPattern {
//    public static void main(String[] args) {
//        // Step 4: Get the singleton instance of NotificationFactory
//        NotificationFactory notificationFactory = NotificationFactory.getInstance();
//
//        // Create and use SMS notification
//        Notification notification1 = notificationFactory.getNotification("SMS");
//        notification1.sendNotification();
//
//        // Create and use Email notification
//        Notification notification2 = notificationFactory.getNotification("EMAIL");
//        notification2.sendNotification();
//
//        // Create and use Push notification
//        Notification notification3 = notificationFactory.getNotification("PUSH");
//        notification3.sendNotification();
//    }
//}

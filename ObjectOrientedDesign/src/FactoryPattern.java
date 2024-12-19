public class FactoryPattern {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification1 = notificationFactory.getNotification("SMS");
        notification1.sendNotification();

        Notification notification2 = notificationFactory.getNotification("EMAIL");
        notification2.sendNotification();

        Notification notification3 = notificationFactory.getNotification("PUSH");
        notification3.sendNotification();
    }
}



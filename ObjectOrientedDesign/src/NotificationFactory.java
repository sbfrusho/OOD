class NotificationFactory{
    public Notification getNotification(String notification){
        if(notification == null){
            return null;
        }
        if(notification.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        else if(notification.equalsIgnoreCase("EMAIL")){
            return new EMAILNotification();
        }
        else if(notification.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        }
        return null;
    }
}
/**
 * Here we use the strategy pattern to allow different notification methods.
 * NotificationService can send notifications using different strategies like Email, SMS, or Push Notification.
 */

public class NotificationService {
    private Notification notification;

    public NotificationService(){}

    public NotificationService(Notification notification){
        this.notification = notification;
    }

    public void setNotification(Notification notification){
        this.notification = notification;
    }

    public void sendNotification(String message){
        notification.sendNotification(message);
    }
}

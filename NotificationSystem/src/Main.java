public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        NotificationService notificationService = new NotificationService();
        notificationService.setNotification(emailNotification);
        notificationService.sendNotification(OrderStatus.PLACED.getMessage());
        notificationService.sendNotification(OrderStatus.SHIPPED.getMessage());
        notificationService.setNotification(new SMSNotification());
        notificationService.sendNotification(OrderStatus.DELIVERED.getMessage());
    }
}
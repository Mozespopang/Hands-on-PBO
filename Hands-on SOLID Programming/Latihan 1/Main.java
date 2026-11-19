public class Main {

    public static void main(String[] args) {
//notifE-mail
        NotificationService email =
                new NotificationService(new EmailNotifier());
//notifSMS
        NotificationService sms =
                new NotificationService(new SMSNotifier());
//notif WA
        NotificationService whatsapp =
                new NotificationService(new WhatsAppNotifier());
//kirim notif
        email.notify("E-Mail tes");
        sms.notify("SMS tes");
        whatsapp.notify("Udah makan?");
    }
}
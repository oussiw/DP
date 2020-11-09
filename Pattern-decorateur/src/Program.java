public class Program {
    public static void main(String[] args) {
        EventNotifier notifier = new EventNotifier(new EmailNotifier());
        notifier.notify("hello");

        INotifier iNotifier = new SMSDecorator(new FacebookDecorator(new EmailNotifier()));
        notifier.setNotifier(iNotifier);
        notifier.notify("test2");
    }
}

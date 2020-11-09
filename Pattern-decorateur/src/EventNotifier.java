public class EventNotifier {
    private INotifier notifier;

    public EventNotifier(INotifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String message){
        notifier.send(message);
    }

    public INotifier getNotifier() {
        return notifier;
    }

    public void setNotifier(INotifier notifier) {
        this.notifier = notifier;
    }
}
